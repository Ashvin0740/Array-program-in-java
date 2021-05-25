import java.util.Scanner;
class SumOfTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("Enter the number of element:");
        n = sc.nextInt();
        int a [] = new int[n];
        System.out.println("Enter the element");
        for(i = 0; i< n ; i++){
            a[i] = sc.nextInt();
        }
        for(i=0; i<n; i++)
        {
            sum += a[i];
        }
		System.out.println("Sum of "+n+" elements in an array = "+sum);
    }
}