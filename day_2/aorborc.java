import java.util.*;
class Big{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a > b ? (a > c ? "a is big" : "c is big") : (b > c ? "b is big" : "c is big"));
        sc.close();

    

    }
}