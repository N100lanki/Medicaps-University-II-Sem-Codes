 import java.util.Scanner;
public class A10OperationOnMatrix {
    static void printMatrix(int M[][],int rowSize, int colSize)
    {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");
 
            System.out.println();
        }
    } 
    // Function to multiply
    // two matrices A[][] and B[][]
     void OperationsOnMatrix( int row1, int col1, int A[][],int row2, int col2, int B[][])
    {
        int i, j, k;
        // Print the matrices A and B
        System.out.println("\nMatrix A:");
        printMatrix(A, row1, col1);
        System.out.println("\nMatrix B:");
        printMatrix(B, row2, col2);
        // Matrix to store the result
        // The product matrix will
        // be of size row1 x col2
        int MulMatrix[][] = new int[row1][col2];
       // Multiply the two matrices
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    MulMatrix[i][j] += A[i][k] * B[k][j];
            }
        }
               int[][] AddMatrix = new int[row1][col1];
               int [][] SubMatrix =new int[row1][col1];
               for ( i = 0; i < row1; i++) {
                      for ( j = 0; j < col1; j++) {
                            AddMatrix[i][j] = A[i][j]+B[i][j];
                            SubMatrix[i][j]=A[i][j]-B[i][j];
                      }
               }
        // Print the result
        System.out.println("\nMultiPlication of Matrix:");
        printMatrix(MulMatrix, row1, col2);
        System.out.println("\nSubstrcation of Matrix:");
        printMatrix(SubMatrix, row1, col2);
        System.out.println("\nAddition of Matrix:");
        printMatrix(AddMatrix, row1, col2);
    }
     // Driver code
    public static void main(String[] X)
    {
               Scanner sc = new Scanner(System.in);
               System.out.print("Enter number of rows & Columns of 1st Matrix A:  "); //rows and columns in matrix1 and matrix2 must be same for addition.
               int row1 = sc.nextInt();
               int col1 = sc.nextInt();
               System.out.print("Enter number of rows & Columns of 2nd Matrix B:  "); //rows and columns in matrix1 and matrix2 must be same for addition.
               int row2= sc.nextInt();
               int col2 = sc.nextInt();
               int[][] A = new int[row1][col1];
               int[][] B = new int[row2][col2];
               if (row2 != col1) 
               { 
                System.out.println("\nMultiplication Not Possible");
               }
               else
               {
        
                      System.out.print("Enter the elements in first matrix :"+" ");
                      for (int i = 0; i < row1; i++) {
                             for (int j = 0; j < col1; j++) {
                                   A[i][j] = sc.nextInt();
                             }
                            }
                      System.out.print("Enter the elements in first matrix :"+" ");
                      for (int i = 0; i < row2; i++) {
                            for (int j = 0; j < col2; j++) {
                                 B[i][j] = sc.nextInt();
                               }
                          }
                          A10OperationOnMatrix ob = new A10OperationOnMatrix();
                          ob.OperationsOnMatrix(row1, col1, A, row2, col2, B);
               }       
    }
}
