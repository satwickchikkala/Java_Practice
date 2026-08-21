import java.util.Scanner;
class Review {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String : -");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            int j;
            for(j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }
            if(i == j){
                arr[index++] = arr[i];
            }
        }
        System.out.println("String after removing duplicate characters is :- " + new String(arr, 0, index));
        // for(int i = 0; i < index; i++){
        //     System.out.print(arr[i]);
        // }
    }
}