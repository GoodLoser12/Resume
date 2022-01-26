import java.util.Scanner;

public class Odd2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num,loop;
	do{
	System.out.println("Hello");
	System.out.println("Enter a no: ");
	num=sc.nextInt();
	loop=num%2;

	}while (loop>0);
	System.out.println("END");
	}
}