import java.util.Scanner;
public class matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of collumns: ");
        int col = sc.nextInt();

        double[][] matA = new double[row][col];
        double[][] matB = new double[row][col]; 
        double[][] matAns = new double[row][col]; 

      
        System.out.println("\nEnter Element of Matrix A: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matA[i][j] = sc.nextDouble();
            }
        }
        System.out.println("\nEnter Element of Matrix B: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matB[i][j] = sc.nextDouble();
            }
        }

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matAns[i][j] = matA[i][j] + matB[i][j];
            }
        }

        System.out.println("\n________________________________");
        System.out.println("Result: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matAns[i][j]+" ");
            }
            System.out.println();
        }
    }
}
