import java.util.Arrays;
class BubbleSort{
public static void main(String[] args){
int []arr = {5,4,6,8,7};
String s ="Befor:-"+ Arrays.toString(arr) ;
System.out.println(s);
for(int i=1; i<arr.length; i++)
{
    for(int j=0; j<arr.length-i; j++)
    {
if(arr[j] > arr[j+1])
{
    int num = arr[j];
    arr[j] = arr[j+1];
    arr[j+1] = num;
}
    }
  }
s = "After:-"+Arrays.toString(arr);
System.out.println(s);

}

    
}