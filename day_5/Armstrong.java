import java.util.Scanner;
class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while(n > 0){
            int r = n % 10;
            sum += r * r * r;
            n /= 10;
        }
        if(sum == temp){
            System.out.println(temp + " is an Armstrong number");
        }else{
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}