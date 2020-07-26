class Maximum{
    public static int getMax(int a[]){
        int max=a[0];
        for (int num :a){
            if(num>max)max=num;
        }
  return max;
    }
    public static void main(String[] args){
int a[] = {12 , 12,45,78,63,3,45,86,8};
int max = getMax(a);
System.out.println("maximum is:" + max);
    }
}