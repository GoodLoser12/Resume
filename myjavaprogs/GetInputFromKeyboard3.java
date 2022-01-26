import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard3{

	public static void main (String[] args){
			BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
		
			String name = "";
			System.out.println("Please Enter Your Name:" );
			try{
				name=dataIn.readLine();
			}catch (IOException e){
				System.out.println("Error");
			}
			System.out.println("Hello " + name + "!");
		 
			String age = "";
			age=JOptionPane.showInputDialog("Please enter your age");
			String iso = "You are " + age + "!";
			JOptionPane.showMessageDialog(null,iso); 
	}
} 