import java.util.*;
class Count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :- ");
        String str = sc.nextLine();
        int u = 0; int l = 0; int n = 0; int sp = 0; int s = 0;
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                u++;
            } else if(Character.isLowerCase(c)){
                l++;
            } else if(Character.isDigit(c)){
                n++;
            }else if(c== ' '){
                sp++;
            }else{
                s++;
            }
        }
        System.out.println("Upper case characters are :- " + u);
        System.out.println("Lower case characters are :- " + l);
        System.out.println("Digits are :- " + n);
        System.out.println("Spaces are :- " + sp);
        System.out.println("Special characters are :- " + s);
        }
    }