import java.util.Arrays;
class Binarysearch {
    public static void main(String[] args) {
        
        int[] arr = { 3, 60, 35, 2, 45, 320, 5 };
        int key = 2;

        Arrays.sort(arr);

        int left = 0; 
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                result = mid - 1;
            }
    }
    if(result == -1){      
        System.out.println("Element is not present in the array");
    } else {
        System.out.println("Element is present at index: " + result);
    }
}
}