import java.util.Scanner;

public class Military2{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String gender="";
	int avg;
	double heightfeet;
	double heightinches;
	int age;
	
	System.out.println("Please input your general weighted average:");
	avg=sc.nextInt();
	if (avg>=80){
		System.out.println("You have met the required general weighted average");
	}else if(avg<=79){	
		System.out.println("You do not meet the required general weighted average");
		System.out.println("You are DISQUALIFIED!");
		System.exit(0);
	}
	
	System.out.println("Please input your gender: (Male/Female)");
	gender = sc.next();
	if (gender.equalsIgnoreCase("Male")){
		System.out.println("Please enter your height");
		System.out.println("feet:");
		heightfeet=sc.nextDouble();
		double feet2inches=heightfeet * 12;
		System.out.println("inches:");
		heightinches=sc.nextDouble();
		double finalheight= heightinches + feet2inches;
		if (finalheight>=64){
		System.out.println("You have met the height requirement");
		}else if(finalheight<=63){
		System.out.println("You do not met the height requirement");
		System.out.println("You are DISQUALIFIED!");
		System.exit(0);
	} else if (gender.equalsIgnoreCase("Female")){}
	}
}
		