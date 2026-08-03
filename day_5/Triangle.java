import java.util.Scanner;
class Perfectsqure2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int no = sc.nextInt();
        int a = 1;
        boolean t = false;
        while(true){
            int tnum = a *(a+1)/2;
            System.out.println(tnum+" ");
            if(tnum == no){
                t = true;
                break;
            }else if(tnum > no){
                break;
            }
            a++;
        }
        if(t){
            System.out.println("\ncan form triangle");
        }else{
            System.out.println("\nCan not form triangle");
        }
            
        }
    }