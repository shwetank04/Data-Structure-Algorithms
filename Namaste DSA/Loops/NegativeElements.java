class Main {
    public static void main(String[] args) {
        int arr[] = {1,-22,-3,4,-5};
        int index = negativeElements(arr);
        System.out.print(index);
    }

    private static int negativeElements(int arr[]){
        int negative =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negative++;
            }
        }
        return negative;
    }
}
