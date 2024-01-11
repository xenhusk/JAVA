import java.util.*;
public class HashingAndProbingMethods {
private int TableSize;
private int[]table;

public void HashTableAndProbingMethods(int TableSize){
    table = new int[TableSize];
    this.TableSize = TableSize;
}

public int DirectHashing(int key){
return key % TableSize;
}

public int SubtractionHashing(int key, int constant){
return key - constant % TableSize;
}

public int DigitExtractionHashing(int key, int digitPosition){
String keyString = String.valueOf(key);
    if(digitPosition >= 1 && digitPosition <= keyString.length()){
    int digit = Character.getNumericValue(keyString.charAt(digitPosition-1));
    return digit;
     }
        else{
          System.out.println("Invalid digit position");
            return -1;
        }
}

public int ModDivisionHashing(int key){
return key % TableSize;
}

public int MidSquareHashing(int key){
    int square = key * key;
    String squareString = String.valueOf(square);
    int midIndex = squareString.length()/2;
    if (squareString.length()%2==1){
        return Character.getNumericValue(squareString.charAt(midIndex));
    }
    else {
        String middleDigits = squareString.substring(midIndex-1, midIndex+1);
        return Integer.parseInt(middleDigits);
    }
}

public int FMFoldShift(int key, int digitsPerChunk){
    String keyString = String.valueOf(key);
    int sum = 0;
    int chunkSize = digitsPerChunk;
    for (int i = 0; i < keyString.length(); i += chunkSize) {
        String chunk = keyString.substring(i, Math.min(i + chunkSize, keyString.length()));
        sum += Integer.parseInt(chunk);
    }
    return sum % TableSize;
}

public int FMFoldBoundary(int key, int digitsPerChunk){
    String keyString = String.valueOf(key);
    int sum = 0;
    int chunkSize = digitsPerChunk;
    for (int i = 0; i < keyString.length(); i += chunkSize) {
        String chunk = keyString.substring(i, Math.min(i + chunkSize, keyString.length()));
        sum += Integer.parseInt(chunk);
    }
    return sum % TableSize;
}

public int LinearProbing(int index, int attempts){
    return (index + attempts) % TableSize;
}

public int QuadraticProbing(int index, int attempts){
    return (index + (attempts * attempts)) % TableSize;
}

public int KeyOffset(int index, int key){
    int offset = key / TableSize;
    return (index + offset) % TableSize + 1;
}


public void insert(int key, int hashingMethod, int probingMethod, int... parameters) {
    int index = -1;
    switch (hashingMethod) {
        case 1: index = DirectHashing(key); break;
        case 2: index = SubtractionHashing(key, parameters[0]); break;
        case 3: {
            index = DigitExtractionHashing(key, parameters[0]);
            break;
        }
        case 4: index = ModDivisionHashing(key); break;
        case 5: index = MidSquareHashing(key); break;
        case 6: {
            index = FMFoldShift(key, parameters[0]);
            break;
        }
        case 7: {
            index = FMFoldBoundary(key, parameters[0]);
            break;
        }
    }

    int attempt = 0;
    while (table[index] != 0) {
        switch (probingMethod) {
            case 1: index = LinearProbing(index, attempt); break;
            case 2: index = QuadraticProbing(index, attempt); break;
            case 3: index = KeyOffset(index, key); break;
        }
        attempt++;
    }

    table[index] = key;
}

public void displayTable() {
    System.out.println("Hash Table:");
    for (int i = 0; i < TableSize; i++) {
        System.out.println(i + ": " + table[i]);
    }
}

public void clearTable(){
    Arrays.fill(table, 0);
}

public void removeAtIndex(int index) {
    if (index >= 0 && index < TableSize) {
        table[index] = 0; 
    } else {
        System.out.println("Invalid index");
    }
}
}
