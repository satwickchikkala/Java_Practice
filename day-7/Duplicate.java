import java.util.*;
class Duplicate {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Stringh : -");
        String str = sc.nextLine();
        int charcount[] = new int[128];
        int dup = 0; 
        for(char c : str.toCharArray()){
            charcount[c]++;
            }
            for(int cnt: charcount){
                if(cnt > 1){
                    dup++;
                }
            }
            System.out.println("Duplicate characters are :- " + dup);
        //     if(dup > 0){
        //         System.out.println("Duplicate characters are present in the string");
        //     } else {
        //         System.out.println("Duplicate characters are not present in the string");
        // }
    }
}