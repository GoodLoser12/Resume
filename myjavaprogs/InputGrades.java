import java.util.Scanner;

public class InputGrades{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String students, grades= "";
	int[] s={1,2,3,4,5,6,7,8,9,10};
	int[] n= {1,2,3,4,5};
	int id,course;
	
	for (int i =0; i<s.length;i++){
		System.out.println("Please enter student name:");
		students=sc.next();
		System.out.println("Please enter student ID NUMBER:");
		id=sc.nextInt();
		if(id>=11){
		System.out.println("INVALID, PLEASE TRY AGAIN");
		System.out.println("Please enter student ID NUMBER:");
		id=sc.nextInt();
	} 
	for (int b=0; b<n.length;b++){
		System.out.println("Please enter student COURSE NUMBER:");
		course=sc.nextInt();
		if(course>=6){
		System.out.println("INVALID, PLEASE TRY AGAIN");
		System.out.println("Please enter student COURSE NUMBER:");
		course=sc.nextInt();
} 		
			System.out.println("Please enter GRADE:");
		grades=sc.next();
		if (!grades.equalsIgnoreCase("A")&&!grades.equalsIgnoreCase("B")&& !grades.equalsIgnoreCase("C")&& !grades.equalsIgnoreCase("D")&& !grades.equalsIgnoreCase("F")){
			System.out.println("INVALID PLEASE TRY AGAIN");
			System.out.println("Please enter GRADE:");
			grades=sc.next();
		}
		
		
	}
	}
	}
}