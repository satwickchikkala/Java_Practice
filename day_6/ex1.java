import java.util.*;
class Main{
public static void main(String args[]) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter no : ");
    int m = sc.nextInt();
    int arr[] = new int[m];
    int n = 9;
    for(int i=0;i<m;i++){
        arr[i] = n++;
        System.out.println(arr[i] + " ");
    }   

    
}
}