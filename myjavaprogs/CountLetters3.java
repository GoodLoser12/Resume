
import java.util.Scanner;

public class CountLetters3 {
    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      String quote = "";
      int count=0;
        
        System.out.println("Please input a sentence: ");
        quote=sc.nextLine();
        for(int i = 0; i < quote.length(); i++) {    
            if(quote.charAt(i) != ' ')    
                count++;    
        }  
        System.out.println("The total number of letters is " + count);
    }
   }


