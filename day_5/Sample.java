// import java.util.Scanner;
// public class Sample{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:- ");
//         int num = sc.nextInt();
//         for(int i = num; i >= 0; i--){
//             for(int j = 0; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//         sc.close();
//     }
// }

public class Sample {
    public static void main(String[] args) {

        int rows = 7;
        int cols = 5;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (
                    (i == 0) ||                     // Top line
                    (i == 3) ||                     // Middle line
                    (i == 6) ||                     // Bottom line
                    (j == 0 && i > 0 && i < 3) ||  // Left side
                    (j == 4 && i > 3 && i < 6)     // Right side
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}