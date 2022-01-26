import java.util.Scanner;

public class Gradesmo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name="";
		double grade=0;
		System.out.println("Please input your full name: ");
		name=sc.nextLine();
		System.out.println("Please input your grade: ");
		grade=sc.nextDouble();
		
		if(grade<=74){
		System.out.println("Hey, "+ name+ " , your grade is FAILED");
		}
		if(grade>=75&& grade<=79){
		System.out.println("Hey, "+ name+ " , your grade is FAIR");
		}
		if(grade>=80&& grade<=85){
		System.out.println("Hey, "+ name+ " , your grade is GOOD");
		}
		if(grade>=86&& grade<=90){
		System.out.println("Hey, "+ name+ " , your grade is VERY GOOD");
		}
		if(grade>=91&& grade<=99){
		System.out.println("Hey, "+ name+ " , your grade is EXCELLENT");
		}
		if (grade>99){
		System.out.println("INVALID GRADE");
		}
	


	}
}	