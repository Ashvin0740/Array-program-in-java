public class ReverseString
{
	public static void main(String[] args)
	{
	String name = "Ashvin vanol";
	String reversed = "";

	for(int i=name.length()-1;i>=0;i--)
		{
		reversed = reversed + name.charAt(i);
		}
		System.out.println("original string: " + name);

	System.out.println("Reversed string: " + reversed);
	}
}

