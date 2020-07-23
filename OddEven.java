import java.util.Scanner;

class OddEven{

    static void OddEven(int num){
        String x=num%2==0?"Even":"odd";
        System.out.println(num+ " is " +x);
    }

      public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            while(true){
              System.out.println("Input no:");
            int x = sc.nextInt();
             if(x==-1)
             break;
            OddEven(x);
            }

        }
    }
