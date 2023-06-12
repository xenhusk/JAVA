import java.util.Scanner;
public class MatrixProblemAssign {
    public static void main(String[]args){
Scanner input =  new Scanner(System.in);

int [][]matrix = {
{10,23,93,44},
{22,34,25,3},
{84,11,7,52}

};

System.out.println("The Matrix");
System.out.println("___________________________________________");
System.out.printf("\n");

for(int ii = 0; ii<3; ii++){
for(int i = 0; i<4; i++){
System.out.print(matrix[ii][i]+"\t");

}
System.out.printf("\n");
}
System.out.println("___________________________________________");

int col0sum = 0;
int col2sum = 0;
//problem no 1
System.out.println("___________________________________________");
System.out.printf("\n");
System.out.println("Problem no. 1");

for (int i = 0; i<3; i++){
col0sum+=matrix[i][0];
col2sum+=matrix[i][2];
}
System.out.println("sum of column index 0 is: "+col0sum);
System.out.println("sum of column index 2 is: "+col2sum);


//problem no 2
System.out.println("___________________________________________");
System.out.printf("\n");
System.out.println("Problem no. 2");

for(int ii = 0; ii<2; ii++){

for(int i=0; i<matrix[ii].length; i++){
System.out.print(matrix[ii][i]+"\t");
}
System.out.printf("\n");
}

//problem no 3
System.out.println("___________________________________________");
System.out.printf("\n");
System.out.println("Problem no. 3");

int greatestno = Integer.MIN_VALUE;// or you can also put "matrix[0][0];"
for(int i = 0; i<matrix.length ;i++){
if (matrix[0][i] > greatestno){
greatestno = matrix[0][i];

}  
}
System.out.print("The greatest no in row index 0 is: "+greatestno);
    }
}
