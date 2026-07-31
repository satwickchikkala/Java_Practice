import java.util.*;
class Digit{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int n=c;
        if(n>=65 && n>=90){
        System.out.println("capital letter");
        }
        else if(n>=97 && n<=122){
        System.out.println("small letter");
    }
        else if(n>=48 && n<=57){
        System.out.println("numbers");
        }
        else if(n>=38 && n<=47 || n>=58 && n<=64){
        System.out.println("symbol");
        }
        else{
         System.out.println("Out of range");

           
        sc.close();

    

    }
}
}