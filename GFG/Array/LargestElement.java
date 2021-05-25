import java.util.Scanner;

public class LargestElement{
    public static void main(String[] args) {
        int n, max,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Element in array:");
        n = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int arr[] = new int[n];
        for(i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for(i = 0; i<n ;i++){
            if( max < arr[i])
            max =arr[i];
        }
        
    System.out.println( "largest number of an array is: " +max);
}
}