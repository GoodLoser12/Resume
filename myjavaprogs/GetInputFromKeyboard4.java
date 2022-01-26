import java.io.*;

public class GetInputFromKeyboard4{

	public static void main (String[] args){
			BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
			String str = "";
			int inum2, inum1= 2;
			double inum3= 3.1416;
			double total;

			System.out.println("Enter radius of a circle" );
			try{
				str=dataIn.readLine();
			}catch (IOException e){
				System.out.println("Error");
			}

			inum2= Integer.parseInt(str);

			total = (inum1 * inum3 * inum2);

			System.out.println("The circumference is: "+ total);
		 
			
	}
} 