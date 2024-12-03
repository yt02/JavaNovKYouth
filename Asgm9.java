import java.util.Scanner;

public class Asgm9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,j;
        int number;
        System.out.print("Enter number: ");
        number = scan.nextInt();
        int[][] InputMatrix = new int[3][4];
        int[][] newMatrix;

        try{
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
                    throw new ArrayIndexOutOfBoundsException();
            }       
            newMatrix = new int[i][j];
            System.out.println("Matrix");
            for(int x=0; x<3;x++){
                for (int y = 0; y < 4; y++) {
                    System.out.print("Enter number for matrix [" + x + "]" + "[" + y  + "]: ");
                    InputMatrix[x][y] = scan.nextInt();

                }                        
            }
            
            System.out.println("Matrix:");
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 4; y++) {
                    //System.out.print(matrix[x][y] + "    ");
                    newMatrix[x][y] = InputMatrix[x][y];
                    System.out.print(newMatrix[x][y] + "    ");
                }
                System.out.println();
            }      
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }
    }
}
