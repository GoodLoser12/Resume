import java.util.Scanner;
public class AlertLevelI{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int lvl;
	System.out.println("PLEASE INPUT ALERT LEVEL");
	lvl=sc.nextInt();
	
	if (lvl==0){
	System.out.println("Quiet or no alert");
	} else if (lvl==1){
	System.out.println("low level or volcanic unrest");
	}else if (lvl==3){
	System.out.println("Magmatic unrest");
	}else if (lvl==4){
	System.out.println("Hazardous eruption eminent");
	}else if (lvl==5){
	System.out.println("Hazardous eruption in progress");
	} else
	System.out.println("Invalid Level");
	}
}