import java.util.*;
class Main{
public static void main(String args[]) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter no : ");
    int m = sc.nextInt();
    int arr[][] = new int[m][m];
    int n = 1;
    for(int i=0;i<m;i++){
        for(int j = 0;j<m;j++){
        arr[i][j] = n++;
        System.out.print(arr[i][j] + " ");
    }   
    System.out.println();
}
}
}