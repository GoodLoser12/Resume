import java.util.Scanner;

public class Military{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String gender="";
	int avg;
	double heightfeet;
	double heightinches;
	int age;
	//average//
	System.out.println("Please input your general weighted average:");
	avg=sc.nextInt();
	if (avg>=80){
		System.out.println("You have met the required general weighted average");
	}else if(avg<=79){	
		System.out.println("You do not meet the required general weighted average");
		System.out.println("You are DISQUALIFIED!");
		System.exit(0);
		}

	//gender &age//
	System.out.println("Please input your gender:(Male/Female)");
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
		}  if(finalheight<=63){
		System.out.println("You do not met the height requirement");
		System.out.println("You are DISQUALIFIED!");
		System.exit(0);
		}
		
	} else if (gender.equalsIgnoreCase("Female")){
		System.out.println("Please enter your height");
		System.out.println("feet:");
		heightfeet=sc.nextDouble();
		double feet2inches=heightfeet * 12;
		System.out.println("inches:");
		heightinches=sc.nextDouble();
		double finalheight= heightinches + feet2inches;
		if (finalheight>=62){
		System.out.println("You have met the height requirement");
		} else if(finalheight<=61){
		System.out.println("You do not met the height requirement");
		System.out.println("You are DISQUALIFIED!");
		System.exit(0);
		}
		}	
	
	//age//
	System.out.println("Please enter your age: ");
	age=sc.nextInt();
	switch (age){
	case 18:
	System.out.println("You have met the age requirement");
	System.out.println("CONGRATULATIONS WELCOME TO THE MILITARY!");
	break;
	
	case 19:
	System.out.println("You have met the age requirement");
	System.out.println("CONGRATULATIONS WELCOME TO THE MILITARY!");
	break;
	
	case 20:
	System.out.println("You have met the age requirement");
	System.out.println("CONGRATULATIONS WELCOME TO THE MILITARY!");
	break;
	
	case 21:
	System.out.println("You have met the age requirement");
	System.out.println("CONGRATULATIONS WELCOME TO THE MILITARY!");
	break;
	default:
	System.out.println("You are DISQUALIFIED!");
	System.out.println("You do not meet the age requirement");
		}		
	}
}