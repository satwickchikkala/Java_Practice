//find the GCD of two numbers
import java.util.Scanner;
class HCF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:- ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:- ");
        int num2 = sc.nextInt();
        
        // int gcd = 0;
        // for(int i = 1; i <= num1 && i <= num2; i++){
        //     if(num1%i==0 && num2%i==0){
        //         gcd = i;

        //     }
        // }
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("HCF is :- " + num1);
    }
}