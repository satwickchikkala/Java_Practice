import java.util.*;
class Main{
public static void main(String args[]) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter no : ");
    int m = sc.nextInt();
    int arr[][][] = new int[m][m][m];
    int n = 1;
    for(int i=0;i<m;i++){
        System.out.print("Matrix: " + i);
        for(int j = 0;j<m;j++){
            for(int k = 0;k<m;k++){
                arr[i][j][k] = n++;
                System.out.print(arr[i][j][k] + " ");
            }
            System.out.println();
        }
    }
}
}
