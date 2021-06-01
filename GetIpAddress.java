import java.net.InetAddress;
 
public class GetIpAddress
{
   public static void main(String args[]) throws Exception
   {
   
      // prints the IP address of your Computer
      System.out.println(InetAddress.getLocalHost());
	  
   }
}