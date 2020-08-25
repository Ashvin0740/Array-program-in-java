import java.util.Scanner;

public class FibonakiSeries
	{
	public static void main(String[] args)
		{
		int n1=0,n2=1;
		System.out.println("How may numbers you want in the sequence:");
		Scanner number = new Scanner(System.in);
		int count = number.nextInt();
		System.out.print("Fibonaki series of " + count +" no. is:");

		int i=1;
		while(count>=i)
			{
				System.out.print(n1 + " ");
				int sumOfPrevTwo = n1+n2;	
				n1=n2;
				n2=sumOfPrevTwo ;
				i++;
			}		
		}
	}


	
