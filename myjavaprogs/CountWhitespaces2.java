/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m303user
 */
import java.util.Scanner;
public class CountWhitespaces2 {
    public static void main (String [] args){
      Scanner sc= new Scanner(System.in);
      String quote = "";
      int count= 0;
      
      System.out.println("Please enter a quote: ");
      quote=sc.nextLine();
      
         for (int i=0 ; i<quote.length(); i++){
            char ch = quote.charAt(i);
            if(ch == ' '){
             count ++;
                System.out.println ("The total Whitespace is " + count);
            }    
        }
     
    }
}
