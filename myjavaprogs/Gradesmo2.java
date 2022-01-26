import java.util.Scanner;

public class Gradesmo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name="";
		int grade=0;
		System.out.println("Please input your full name: ");
		name=sc.nextLine();
		System.out.println("Please input your grade: ");
		grade=sc.nextInt();
		
		if(grade<=74){
		System.out.println("Hey, "+ name+ " , your grade is FAILED");
		}else if(grade>=75&& grade<=79){
		System.out.println("Hey, "+ name+ " , your grade is FAIR");
		}else if(grade>=80&& grade<=85){
		System.out.println("Hey, "+ name+ " , your grade is GOOD");
		}else if(grade>=86&& grade<=90){
		System.out.println("Hey, "+ name+ " , your grade is VERY GOOD");
		}else if(grade>=91&& grade<=99){
		System.out.println("Hey, "+ name+ " , your grade is EXCELLENT");
		}



	}
}