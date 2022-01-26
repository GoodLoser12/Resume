import java.util.Scanner;

public class Alertwhile{	
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	int lvl;
	int yn=1;

	while(yn==1){
	System.out.println("PLEASE INPUT ALERT LEVEL");
	lvl=sc.nextInt();
	switch(lvl){
	case 0:
	System.out.println("Quiet or no alert");
	System.out.println("Would you like another test? 0-No, 1- Yes");
	yn=sc.nextInt();
	break;
	
	case 1:
	System.out.println("low level or volcanic unrest");	
	System.out.println("Would you like another test? 0-No, 1- Yes");
	yn=sc.nextInt();
	break;
	
	case 3:
	System.out.println("Magmatic unrest");	
	System.out.println("Would you like another test? 0-No, 1- Yes");
	yn=sc.nextInt();
	break;
	
	case 4:
	System.out.println("Hazardous eruption eminent");
	System.out.println("Would you like another test? 0-No, 1- Yes");
	yn=sc.nextInt();
	break;
	
	case 5:
	System.out.println("Hazardous eruption in progress");
	System.out.println("Would you like another test? 0-No, 1- Yes");
	yn=sc.nextInt();
	break;
	default:
	System.out.println("Invalid Level");
	System.out.println("Would you like another test? 0-No, 1- Yes");
	yn=sc.nextInt();
	}
	}
	}	
}
