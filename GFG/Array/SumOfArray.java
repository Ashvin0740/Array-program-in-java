// import java.util.Scanner;
class SumOfArray {
    static int arr[] = {12,45,78,96,65};
    
    static int sum(){
        int sum= 0;
        int  i;
        for(i =0; i< arr.length; i++){
            sum += arr[i]; 
        }
        return sum;
        
    }

    
    public static void main(String[] args) {
        
        System.out.println(sum());
    }

}