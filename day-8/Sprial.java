import java.util.Scanner;
class Sprial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No:- ");
        int no = sc.nextInt();
        int size = 2 * no - 1; // new code
        int matrix[][] = new int[size][size];
        int r, c, num;

        //fill Matrix
        for(r = 0; r < size; r++){
            for(c = 0; c < size; c++){
                num = Math.min(Math.min(r, c), Math.min(size - 1 - r, size - 1 - c)); // new code
                matrix[r][c] = no - num;

            }
        }
        //Display Matrix
        for(r = 0; r < size; r++){
            for(c = 0; c < size; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();

        }
        sc.close();

    }
}