import java.util.Scanner;
class Perfectsqure {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i * i);
            // if(i * i == n){
            //     System.out.println(n + " is a perfect square");
            // }else{
            //     System.out.println(n + " is not a perfect square");
            // }
        }
    }
}