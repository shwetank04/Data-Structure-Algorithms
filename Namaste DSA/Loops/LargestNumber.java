class Main {
    public static void main(String[] args) {
        int arr[] = {1,-22,-3,4,-5};
        int res = largestNumber(arr);
        System.out.print(res);
    }

    private static int largestNumber(int arr[]){
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
               largest = arr[i];
            }
        }
        return largest;
    }
}
