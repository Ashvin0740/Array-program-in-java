// Demo of some of the Mathematical functions

class JavaMath
{
    public static void main(String[] args)     
    {    
        int x = 28;    
        int y = 4;   
        float z = -6.76f;
  
        // return the maximum of two numbers  
        System.out.println("Maximum number of x & y is: "+Math.max(x, y));

        // return the minimum of two numbers  
        System.out.println("Minimum number of x & y is: "+Math.min(x, y));
          
	// value of the argument rounded to the nearest int value
	System.out.println("Rounded value for z is: "+Math.round(z));
	
        // return the square root of y   
        System.out.println("Square root of y is: "+Math.sqrt(y));   
        
	// return the cube root of y   
        System.out.println("Cube root of x is: "+Math.cbrt(x));   
        
	//returns 28 power of 4 i.e. 28*28*28*28    
        System.out.println("Power of x and y is: " + Math.pow(x, y));      
  
	//to find the smallest integer value that is greater than or 
	//equal to the argument or mathematical integer.
	System.out.println("Ceiling value for z is: "+Math.ceil(z));

	//return the absolute value
	System.out.println("Absolute value of z is: "+Math.abs(z));

        // return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
          
        // return the logarithm of given value when base is 10      
        System.out.println("log10 of x is: " + Math.log10(x));   
        System.out.println("log10 of y is: " + Math.log10(y));    
	
    }    
}