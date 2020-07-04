class SumOfArray
{
	static int arr[] = {1,5,7,6,9,8};

	static int sum()
		{
			int sum = 0;
			for(int i=0;i<arr.length; i++)
			sum += arr[i];

		return sum;
		}

	public static void main(String[] args)
		{	
			System.out.println("Sum of the given Array:" + sum());
		}
}
