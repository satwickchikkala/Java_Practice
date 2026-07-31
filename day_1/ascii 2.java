
public class ascii2{
  public static void main(String[] args)
  {
    Scanner  sc = new Scanner(System.in);
    System.out.println("Enter a character:");
    char ch = sc.next().charAt(0);
    int a = ch;
    if(a>=65 && a<=90)
     System.out.println("Capital Letters");
    if(a>=97 && a<=122)
     System.out.println("Small Letters");
    if (a>= 48 && a<=57)
     System.out.println("Numbers");
    if (a>= 128 && a<=256)
     System.out.println("Extended ASCII");
    if (a == 32)
    System.out.println("Space");
  }
  
}