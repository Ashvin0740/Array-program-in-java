import java.util.*; 
import java.lang.*; 
import java.io.*; 
class LinearSearch
{

	 static int countRotations(int arr[],int n)
{
 int min = arr[0], min_index = -1;
 for( int i= 0; i<n ;i++)
{
	if (min > arr[i])
		{
		min = arr[i];
		min_index = i;
		}
}
return min_index;

}

    public static void main (String[] args) 
{
	int arr[] = {12,45,15,300,4,9,5};
	int n = arr.length;
	
	System.out.println(countRotations(arr,n));
}

}

