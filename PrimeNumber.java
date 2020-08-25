import java.util.Scanner;
public lass PrimeNumber
{	
	public static void main(String[] args)
	{
		int temp;
		boolean isPrime=true;
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		
		for(int i = 2; i<=number/2; i++)
		{
			temp = number%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
	if(isPrime)
	{
		System.out.println(number +" is a prime number");
	}
	else
	{

		System.out.println(number +" is not a prime number");
	}
    }
}
