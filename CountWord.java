/* Java Program Example - Count Occurrence of Word in Sentence */

import java.util.Scanner;

public class CountWord {
    public static int CountWords(String str) {

        int count = 1;
        for(int i=0; i<=str.length()-1; i++)
        {

        if(str.charAt(i)== ' ' && str.charAt(i+1)!= ' ')
        {
            count ++;
        }
    }
        return count;
       }

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Sentence : ");
     String sentence = sc.nextLine(); 


     System.out.print("Total Number of Words in Entered Sentence is " + CountWords(sentence));


    }
}