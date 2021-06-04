import java.util.Scanner;

public class AddNNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Number You want to Enter to Add them ? ");
        int n = sc.nextInt();

        System.out.print("Enter " +n+ " numbers : ");
        int sum = 0;

for(int i =0; i < n; i++ ){
    // int sum = 0;
    int num = sc.nextInt();
    sum = sum + num;

}
System.out.print("Sum of all " +n+ " numbers is " +sum);


    }
}