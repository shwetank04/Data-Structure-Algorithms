class Main {
    public static void main(String[] args) {
        int [] arr = {4,9,0,2,8,7,1,9};
        secondLargest(arr);
    }

    public static void secondLargest(int [] arr){
        int largest =Integer.MIN_VALUE,secondLargest = Integer.MIN_VALUE;
            for(int i = 0;i<arr.length;i++){
                if(arr[i] > largest){
                    int temp = largest;
                    largest = arr[i];
                    secondLargest = temp;
                }
                else if(arr[i]>secondLargest && arr[i]!=largest){
                    secondLargest = arr[i];
                }
            }
        System.out.println("Largest is "+largest);
        System.out.println("Second Largest is "+secondLargest);
    }
}
