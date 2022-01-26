import java.util.Scanner;
	
public class Investment{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double amount;
	double rate=0.08;
	double year;
	
	System.out.println("Please enter the amount: ");
	amount=sc.nextDouble();
	if (amount==0){
	System.out.println("ERROR");
	System.exit(1);
	}
	System.out.println("Please enter the number of year: ");
	year=sc.nextDouble();
	if(year==0){
	System.out.println("ERROR");
	System.exit(1);	
	}
	
	if(amount!=0&&year!=0){for(int i=1;i<=year;i++){
	double moneyearned=amount*Math.pow((1+rate),i);
	System.out.println("TOTAL AMOUNT IN YEAR "  + i );
	System.out.println(moneyearned);
	}

	}
	}
}