/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m303user
 */

public class CountWhitespaces{
    public static void main (String [] args){
      String quote = "To be or not to be";
      int count= 0;
      
      System.out.println(quote);
      
        for (int i=0 ; i<quote.length(); i++){
            char ch = quote.charAt(i);
            if(ch == ' '){
             count ++;
             System.out.println ("The total Whitespace is " + count);
            }   
        }
     
    }
}

