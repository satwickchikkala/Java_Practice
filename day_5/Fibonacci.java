import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        int a  = 0, b = 1, c = 0;
        for (int i = 1; i <= n; i++){
            System.out.println(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}