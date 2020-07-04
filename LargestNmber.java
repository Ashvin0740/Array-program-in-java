class LargestNmber
{
	static int arr[]= {12,789,45,878,14,1,0};
 static int largest()
   	{
	int max = arr[0];	
	for(int i=0; i<arr.length;i++)
	if(arr[i] > max)
	max=arr[i];
return max;

}

publlic static void main(String[] args)
{
	System.out.println("largest in the given Array:" + largest());
}

}