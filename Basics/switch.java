class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
        double output = 0;
        double radius =0 , length=0 , breadth = 0;
        if(arr.size() == 1){
            radius = arr.get(0);
        }
        else if(arr.size() == 2){
            length = arr.get(0);
            breadth = arr.get(1);
        }
        switch(choice){
            case 1 : output = Math.PI * radius * radius;
                break;
            case 2 : output = length * breadth;
                break;
            default : output = -1;
        }
        return output;
    }
}
