import java.util.Scanner;

/**
 * adds 2 matrices
 * @author Suyash Patel
 */
public class AddTwoMatrices {

    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the matrices:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns for the matrices:");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter the elements of the first matrix:");
        enterMatrixElements(scanner, matrix1);
        System.out.println("Enter the elements of the second matrix:");
        enterMatrixElements(scanner, matrix2);
        int[][] resultMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Resultant matrix after addition:");
        printMatrix(resultMatrix);

        scanner.close();
    }

    /**
     * matrix elements
     * @param scanner scanner
     * @param matrix matrix
     */
    public static void enterMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    /**
     * adds matrices
     * @param matrix1 first matrix
     * @param matrix2 second matrix
     * @return sum of two matrices
     */
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    /**
     * prints matrix
     * @param matrix matrix
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

