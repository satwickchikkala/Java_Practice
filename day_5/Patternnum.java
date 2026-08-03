// import java.util.Scanner;

// public class Patternnum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number:- ");
//         int n = sc.nextInt(); // step 1
//         String term = "1"; // step 2
//         for(int i = 0; i < n; i++) // step 3
//         System.out.println(term); // step 4 (loop)
//         StringBuilder next = new StringBuilder(); // step 5
//         int j = 0;
//         while(j < term.length())//step 6
//         {
//             char ch = term.charAt(j);
//             int count = 1;
//             while (j+1 < term.length() && term.charAt(j + 1) == ch) // checking duplicate
//             // {
//                 count++; // step 6
//                 j++;
//             }
//             next.append(count).append(ch); // step 8
//             j++;
//         }
//         term = next.toString(); // step 9


//                 }
//                 }



//perfect square
import java.util.Scanner;
class Number_System_11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sc.nextInt();
        String term="1";
        for(int i =0;i<n;i++) {
            System.out.println(term);
            StringBuilder next = new StringBuilder();
            int j = 0;
            while(j<term.length())
            {
                char ch = term.charAt(j);
                int count = 1;
                while(j+1<term.length() && term.charAt(j + 1)==ch)
                {
                    count++;
                    j++;
                }
                next.append(count).append(ch);
                j++;
            }
            term=next.toString(); 
        }
    }
}