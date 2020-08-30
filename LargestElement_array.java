public class LargestElement_array
{
	public static void main(String[] args)
	{
	int arr[] = new int[]{14,18,63,45,79,25,3,61,2};
	

	int max =arr[0];
	for(int i=0; i<arr.length; i++)
	{
	if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println(" The largest Number of an array is:"+ max);
    }
}