// import java.util.Scanner;

// class XPattern {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine();

//         int n = str.length();

//         if (n % 2 == 0) {
//             System.out.println("Please enter a string with an odd number of characters.");
//             return;
//         }

//         for (int i = 0; i < n; i++) {

//             for (int j = 0; j < n; j++) {

//                 if (i == j || i + j == n - 1) {
//                     System.out.print(str.charAt(j));
//                 } else {
//                     System.out.print(" ");
//                 }

//             }

//             System.out.println();
//         }

//         sc.close();
//     }
// }

import java.util.Scanner;

public class Cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print(str.charAt(i));
                } else if (j == n - 1 - i) {
                    System.out.print(str.charAt(n - 1 - i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}