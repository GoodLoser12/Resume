import java.util.Scanner;
public class Grades{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		grade=sc.nextInt();
		switch(grade){
		case 100:
			System.out.println("EXCELLENT");
		break;
		case 90:
			System.out.println("Good job!");
		break;
		case 80:
			System.out.println("Study harder");
		break;
		default:
		System.out.print("BOBO MO");
		}
	}
}