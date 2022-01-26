import java.util.Scanner;
	
public class Investment2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double amount, year,interest;
	double rate=0.08;

	
	System.out.println("Please enter the amount: ");
	amount=sc.nextDouble();
	System.out.println("Please enter the number of year: ");
	year=sc.nextDouble();
	System.out.println("Please enter interest rate: ");
	interest=sc.nextDouble();
	
	if(amount!=0&&year!=0&&interest!=0){for(int i=1;i<=year;i++){
	double moneyearned=amount*Math.pow((1+rate/100),i);
	System.out.println("TOTAL AMOUNT IN YEAR "  + i );
	System.out.println(moneyearned);
	}
	}if (amount==0&&year==0&&interest==0){
	System.out.println("ERROR");
	System.exit(1);
	}
	}
}