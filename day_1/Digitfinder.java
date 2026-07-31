import java.util.Scanner;
public class Digitfinder {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int no = sc.nextInt();
    if ( no >= 0 && no <10)
      {System.out.println(" The Number is Single Digit" );
  }
    if ( no >= 10 && no <= 99){
      System.out.println(" The Number is double digit");}
    if ( no >= 100 &&no <= 999)
      {System.out.println("Not applicable");}
  }
}
