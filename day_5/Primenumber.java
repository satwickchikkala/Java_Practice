//prime or not a prime
import java.util.Scanner;
class Primenumber {
    static boolean isprime(int num){
        if(num < 1)
            return false;
        if(num == 1 || num == 2)
            return true;
        if( num %2 == 0)
            return false;
        for(int i = 3; i <= Math.sqrt(num); i += 2){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        if(isprime(num))
            System.out.println(num + " is Prime number");
        else 
            System.out.println(num + "is not prime Number");
    }
    }