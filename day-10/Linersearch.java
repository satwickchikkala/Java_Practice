class Linersearch {
    public static void main(String[] args) {
        
        int[] arr = { 3, 60, 35, 2, 45, 320, 5 };
        int key = 2;
        int result = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                result = i;
                break;
    }
}
    if(result == -1){      
        System.out.println("Element is not present in the array");
    } else {
        System.out.println("Element is present at index: " + result);
    }
}
}
