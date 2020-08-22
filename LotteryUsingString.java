import java.util.Scanner;
public class LotteryUsingString
	{
	public static void main(String[] args)
		{

		String lottery = "" + (int)(Math.random()*10)+(int)(Math.random() * 10);

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your lottery pick(two digits):");

		String guess = input.nextLine();

   // Get digits from lottery
    int lotteryDigit1 = lottery.charAt(0); 
    int lotteryDigit2 = lottery.charAt(1); 
   // Get digits from guess
    int guessDigit1 = guess.charAt(0);
    int guessDigit2 = guess.charAt(1);

   System.out.println("The lottery number is " + lottery);

		if (guess.equals(lottery))
		{
		 	System.out.println("Exact match: you win 10,000 RS");
		}
		else if( guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
		{
			System.out.println("Match all digits: you win 3,000 RS");
		}
		else if(guessDigit1 == lotteryDigit1 
			|| guessDigit1 == lotteryDigit2
			|| guessDigit2 == lotteryDigit1 
			|| guessDigit2 == lotteryDigit2 )
		{
      			System.out.println("Match one digit: you win 1,000 RS");
		}
		else
		{
    		  System.out.println("Sorry, no match"); 
		}
	}
}