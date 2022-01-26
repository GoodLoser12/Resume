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
public class CountVowels2 {
   
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String quote= "";
        int count= 0;
        
        System.out.println ("Please enter a quote");
        quote=sc.nextLine();
        for (int i=0 ; i<quote.length(); i++){
            char ch = quote.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
                count ++;
     
            }
        } System.out.println ("The total vowel is " + count);
     
    }
}

