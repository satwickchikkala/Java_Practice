import java.util.*;
// reverse number of array elements code
// class Reverse {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number : -");
//         int no = sc.nextInt();
//         int arr[] = new int[no];
//         System.out.println("enter the array elements : -");
//         for(int i = 0; i < no; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Array elements are : -");
//         for(int i = 0; i < no; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//         System.out.println("Reverse of Array elements are : -");
//         for(int i = no - 1; i >= 0; i--){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:- ");
        String str = sc.nextLine();
        int i = str.length();
        while (i > 0){
            System.out.print(str.charAt(i-1));
            i--;
        }
    }
}