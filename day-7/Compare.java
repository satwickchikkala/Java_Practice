import java.util.*;
class Compare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : -");
        int no = sc.nextInt();
        int arr1[] = new int[no];
        int arr2[] = new int[no];
        System.out.println("enter the first array elements : -");
        for(int i = 0; i < no; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter the second array elements : -");
        for(int i = 0; i < no; i++){
            arr2[i] = sc.nextInt();
        }
        int flag = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < no; i++){
            if(arr1[i] == arr2[i]){
                flag = 0;
                break;
            } else {
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Arrays are Same");
        } else {
            System.out.println("Arrays are not Same");
        }
    }
}