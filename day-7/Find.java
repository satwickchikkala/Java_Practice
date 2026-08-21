import java.util.*;
class Find {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : -");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int act = 0;
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int exp = size *(size + 1)/2;
        for(int i = 0; i < size; i++){
            act += arr[i];
        }
        System.out.println("Actual sum is :- " + act);
        System.out.println("Expected sum is :- " + exp);
        System.out.println("Missing number is :- " + (exp - act));
    }
}