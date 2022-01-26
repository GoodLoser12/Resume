/*
Cutay, Kurt Kevin N.





*/





import java.util.Scanner;

public class Quiz{
	public static void main(String[] args) {
		String[] multiChoice1;
		Scanner input = new Scanner(System.in);
		int score=0, scorePro=0;
		String uSelect1="";
		int i= 0;

		multiChoice1 = new String[10];
		multiChoice1[0] = "1.Do I like boxing?";
		multiChoice1[1] = "2.Do I like martial arts?";
		multiChoice1[2] = "3.Do I like reading books";
		multiChoice1[3] = "4.Is JK Rowling my favorite author?";
		multiChoice1[4] = "5.Is the Kingsman my favorite movie of all time?";
		multiChoice1[5] = "6.Is Chloe Moretz my favorite international actress?";
		multiChoice1[6] = "7.Is Marian Rivera my favorite Filipina actress?";
		multiChoice1[7] = "8.IS One Piece my favorite anime?";
		multiChoice1[8] = "9.Is GTO my favorite manga?";
		multiChoice1[9] = "10.Is Ikki from Air Gear my favorite manga character?";

		String[][] answers1 ={{"A","No"},{"B","Yes"},{"C","How I am supposed to know that"},{"D","Invalid"}};
		
		
		do{ 	
				System.out.println(multiChoice1[0]);
				System.out.println(answers1 [0] [0]+". " + answers1[0][1]);
				System.out.println(answers1 [1] [0]+". " + answers1[1][1]);
				System.out.println(answers1 [2] [0]+". " + answers1[2][1]);
				System.out.print("Your answer: ");
				uSelect1 = input.next();
				
				if(!uSelect1.equalsIgnoreCase("a")&&!uSelect1.equalsIgnoreCase("b")&&!uSelect1.equalsIgnoreCase("c")){ 
					System.out.println("INVALID!");
					System.out.print("Your answer: ");
					uSelect1 = input.next();
					uSelect1.toUpperCase();
					}
					
				if(uSelect1.toUpperCase().equals("A")){
					System.out.println("The correct answer is B");
					}
					
				if(uSelect1.toUpperCase().equals("C")){
					System.out.println("Incorrect!");
					System.out.println("The correct answer is B");						 
					} 
					
				if(uSelect1.toUpperCase().equals("B")){
					System.out.println("Correct!");
					scorePro++;
					score++;
				}
				
				multiChoice1[0]= multiChoice1[++i];
				System.out.println("Your score is "+score+"/10");
			} 
		
			while(uSelect1.equalsIgnoreCase("a")|| uSelect1.equalsIgnoreCase("b")||uSelect1.equalsIgnoreCase("c"));

	}
}