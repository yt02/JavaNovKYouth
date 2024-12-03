import java.util.Scanner;

public class Asgm7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,j;
        int number;
        System.out.print("Enter number: ");
        number = scan.nextInt();

        switch (number) {
            case 1:
                i=3;
                j=4;
                break;

            case 2:
                i=2;
                j=3;
                break;

            default:
                throw new AssertionError();
        }
        int[][] matrix = new int[i][j];
        System.out.println("Matrix " + i + "*" + j);
        for(int x=0; x<i;x++){
            for (int y = 0; y < j; y++) {
                System.out.print("Enter number for matrix [" + x + "]" + "[" + y  + "]: ");
                matrix[x][y] = scan.nextInt();

            }
            
        }

        System.out.println("Matrix:");
        for (int x = 0; x < i; x++) {
            for (int y = 0; y < j; y++) {
                System.out.print(matrix[x][y] + "    ");
            }
            System.out.println();
        }

    }
}
