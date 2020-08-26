import java.util.Scanner;
    public class FactorialNumber
    {
        public static void main(String[] args)
        {
            int Number;
            System.out.println("Enter the number:");
            Scanner sc = new Scanner(System.in);
            Number = sc.nextInt();
            long fact = 1;
            for(int i=1; i<=Number;i++)
            {
                fact = fact*i;
            }
            System.out.println("Factorial of " + Number +" is : "+fact);

        }
    }