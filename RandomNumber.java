import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int len,i,randnum;
        System.out.print("How Many Random Numbers You want to Generate ? ");
         len = sc.nextInt();

        System.out.print("\nGenerating " + len + " Random Numbers in the range 0...999 \n");
        
        for(i = 0; i< len; i++){
            randnum = rd.nextInt(1000);
            System.out.println(randnum + " ");
        }


    }
}