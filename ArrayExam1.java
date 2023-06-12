public class ArrayExam1 {
    public static void main (String[]args){
int one [] = new int[5];
int two [] = new int [10];
for(int j = 0; j<5; j++)
one [j] = 5*j+3;
System.out.print("One contains: ");

for(int j=0; j<5; j++)
System.out.print(one[j]+" ");
System.out.println();
for(int j=0; j<5; j++){
    two[j] = 2*1+3;
    two[j] = two[j]+=(10*j);
}
System.out.print("Two contains: ");

for (int j=0; j<10; j++)
System.out.print(two[j]+" ");
System.out.println();
}
}
