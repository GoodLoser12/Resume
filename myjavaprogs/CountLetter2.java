
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m303user
 */
public class CountLetter2 {
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
}
