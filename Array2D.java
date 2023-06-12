import java.util.Scanner;
public class Array2D {
    public static void main(String[]args){
Scanner input =  new Scanner(System.in);

System.out.print("How many rows: ");
int rows = input.nextInt();
System.out.print("How many columns: ");
int columns = input.nextInt();

int [][] scores = new int [rows][columns];
int row = 0;
int col = 0;

for (row = 0; row<rows; row++){
for (col = 0; col<columns; col++){
System.out.print("Input row "+row+" column "+col+" cell: ");
scores [row][col] = input.nextInt();
}
}

for (int ii = 0; ii<row; ii++){
for(int i = 0; i<col; i++){
System.out.print(scores[ii][i]+"\t");
}
System.out.println("");
}
    }
}