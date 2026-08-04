import java.util.*;
class Main{
public static void main(String args[]) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter char : ");
    String name = sc.next();
    char c[] = name.toCharArray();
    for(int i=name.length()-1;i>=0;i--){
        System.out.print(c[i] +" ");
    }

    
}
}
