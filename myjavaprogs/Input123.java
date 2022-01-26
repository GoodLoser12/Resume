import java.util.Scanner;

public class Input123{	
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	int lvl;
	int yn=1;

	while(yn==1){
	System.out.println("PLEASE INPUT A NUMBER from 1-4");
	lvl=sc.nextInt();
	switch(lvl){
	case 1:
	System.out.println("GOOD JOB!");
	System.out.println("Would you like to try again? 0-No, 1- Yes");
	yn=sc.nextInt();
	break;
	
	case 2:
	System.out.println("GOOD JOB!");	
	System.out.println("Would you like to try again? 0-No, 1- Yes");
	yn=sc.nextInt();
	break;
	
	case 3:
	System.out.println("GOOD JOB!");	
	System.out.println("Would you like to try again? 0-No, 1- Yes");
	yn=sc.nextInt();
	break;
	
	case 4:
	System.exit(1);
	break;

	default:
	System.out.println("ERROR");	
	System.out.println("Would you like to try again? 0-No, 1- Yes");
	yn=sc.nextInt();

	}
	}
	}	
}
