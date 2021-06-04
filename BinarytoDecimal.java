import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        
        int binnum,decnum=0,i=1, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number : ");
        binnum = sc.nextInt();
        while( binnum !=0 ){
            rem = binnum%10;
            decnum = decnum + rem*i;
            i = i*2;
            binnum = binnum/10;
        }
        	
        System.out.print("Equivalent Decimal Value of " +binnum+ " is :\n");
        System.out.print(decnum);

    }

}