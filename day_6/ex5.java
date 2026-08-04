import java.util.*;
class Main{
public static void main(String args[]) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter no : ");
    int m = sc.nextInt();
    int a[][][] = new int[m][m][m];
    int b[][][] = new int[m][m][m];
    int c[][][] = new int[m][m][m];
    int n = 1;
    for(int i=0;i<m;i++){
        for(int j = 0;j<m;j++){
            for(int k = 0;k<m;k++){
                a[i][j][k] = n;
                b[i][j][k] = a[i][j][k] + a[i][j][k];
                c[i][j][k] = b[i][j][k] + b[i][j][k];   
                n = n + 10;
                System.out.print(c[i][j][k] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }
}
}
