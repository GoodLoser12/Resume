/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m303user
 */

public class CountVowels {
    public static void main (String[] args){
        String quote= "Home is the place, when you have to go there, they have to take you in. Robert Frost";
        int count= 0;
           
        for (int i=0 ; i<quote.length(); i++){
            char ch = quote.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
                count ++;
                System.out.println ("The total vowel is " + count);
            }
        
         }
 
    }
}
    
