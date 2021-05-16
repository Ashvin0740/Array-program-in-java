public class TryCatch{
    public static void main(String[] args) {
        int a = 458;
        int b = 0;
        try {
            int c= a/b;

            System.out.println("A divided by b is " + c);
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}