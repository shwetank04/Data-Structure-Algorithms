class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int index = searchElement(4,arr);
        System.out.print(index);
    }

    private static int searchElement(int n,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
}
