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
public class LuckyTree {

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a=0;
    int n=1;
  
     
    while(n==1){  
	System.out.println("Please Input number of branches: ");
    a=sc.nextInt(); 
     if (a>5000){
        System.out.println("Invalid Input");
	} 
     if (a<0){
        System.out.println("Invalid Input");
	} 
    if (a==0){
    System.exit(1);}
    
    if (a%3==0 && a%7==0&& a<=5000 ^ a<0){
	System.out.println("Lucky Tree");
    }else if (a%3>=1 || a%7>=1 && a<=5000 && a<0){
	System.out.println("Not Lucky Tree");
	}
        } 
    }         
}

    
