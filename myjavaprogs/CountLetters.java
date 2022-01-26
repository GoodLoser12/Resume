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

public class CountLetters {
    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
      String quote = "BE LIKE A WATER";
      int count=0;
      
        for(int i = 0; i < quote.length(); i++) {    
            if(quote.charAt(i) != ' ')    
                count++;    
        }   
        System.out.println(quote);
        System.out.println("The total number of letters in the quote is " + count);
    }
}
