// import java.util.Scanner;
// class ReverseSprial
// {
// public static void main(String args[]) // step 1
// {
// Scanner sc=new Scanner(System.in);
// System.out.print("Enter No :");
// int no=sc.nextInt(); // Step 2
// int matrix[][]=new int[no][no];
// int r,c,num=1;
// for(r=(no+1)/2;r<0;r++) // Step 3
// {
//      for(c=no-r;c<r;c--)  // Fill Top rows - Step 4
//      {
//      matrix[r][c] = num--;
//      }
//      for(c=no-r;c<r+1;c--)  // Fill Right cols - Step 5
//      {
//      matrix[c][no-r-1] = num--;
//      }
//     for(c=r;c>=no-r-2;c--)  // Fill Last cols - Step 6
//      {
//      matrix[no-r-1][c] = num--;
//      }
//      for(c=r;c>no-r-2;c--)  // Fill First cols - Step 7
//      {
//      matrix[c][r] = num--;
//      }
// }
// for(r=no-1;r>=0;r--) // Step 3 - Displaying Matrix
// {
//     for(c=no-1;c>=0;c++)
//     {
//     System.out.print(matrix[r][c] + "\t");
//     }
//   System.out.println("\n");
// }
// // int pp=1;
// // System.out.println("(0,0)");
// // for(r=0;r<no;r++) // To print Powerpoints
// // {
// //     for(c=0;c<no;c++)
// //     {
// //     if(matrix[r][c]%11==0)
// //     {
// //     System.out.println("("+ r + "," + c + ")");
// //     pp++;
// //     }
// //    }
// // }
// // System.out.println("Total Power points : " + pp);
// }}

import java.util.Scanner;

class ReverseSpiral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of matrix: ");
        int no = sc.nextInt();

        int[][] matrix = new int[no][no];

        int num = 1;
        int top = 0;
        int bottom = no - 1;
        int left = 0;
        int right = no - 1;

        // Fill Spiral Matrix
        while (top <= bottom && left <= right) {

            // Top Row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Right Column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Bottom Row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // Left Column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        // Print Reverse Spiral
        System.out.println("\nReverse Spiral Matrix:");

        for (int r = no - 1; r >= 0; r--) {
            for (int c = no - 1; c >= 0; c--) {
                System.out.print(matrix[r][c] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}