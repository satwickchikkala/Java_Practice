//find the GCD of two numbers
import java.util.Scanner;
class LCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:- ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:- ");
        int num2 = sc.nextInt();

        // lcm logic code num1 and num2
        int lcm = 0;
        int max = (num1 > num2) ? num1 : num2;
        for(int i = max; ; i++){
            if(i%num1 == 0 && i%num2 == 0){
                lcm = i;
                break;
            }
        }
        
        // int gcd = 0;
        // for(int i = 1; i <= num1 && i <= num2; i++){
        //     if(num1%i==0 && num2%i==0){
        //         gcd = i;

        //     }
        // }
        // while(num2 != 0){
        //     int temp = num2;
        //     num2 = num1 % num2;
        //     num1 = temp;
        // }
        System.out.println("LCM is :- " + lcm);
    }
}