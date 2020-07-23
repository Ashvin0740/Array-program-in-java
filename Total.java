import java.util.Scanner;
class Total{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
    
        int total=0;
        for(int i=0; i<=5; i++){
            System.out.println("inter the number "+ i +": ");
         int number=sc.nextInt();

            total += number;
        }
            System.out.println("total :" + total);

    }
}