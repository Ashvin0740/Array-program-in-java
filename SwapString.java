import java.util.Scanner;

public class SwapString {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string : ");
        String str2 = sc.nextLine();

        System.out.println("\nStrings before Swapping are :");
        System.out.println(" String1 = " + str1 );
        System.out.println(" String2 =" + str2 );

        String temp = str1;
        str1 = str2;
        str2 =temp;
        
        System.out.println("\nStrings after Swapping are :");
        System.out.println(" String1 =" + str1 );
        System.out.println(" String2 =" + str2 );
    
        // String a = "ashvin vanol jamnagar";
        // System.out.println(a.toUpperCase());
    }
}