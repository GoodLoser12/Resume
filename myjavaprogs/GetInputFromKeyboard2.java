import javax.swing.JOptionPane;

public class GetInputFromKeyboard2{

	public static void main (String[] args){
		String name = "";
			name=JOptionPane.showInputDialog("Please enter your name");
			String msg = "Hello " + name + "!";
			JOptionPane.showMessageDialog(null,msg); 
			String age = "";
			age=JOptionPane.showInputDialog("Please enter your age");
			String iso = "Hello " + age + "!";
			JOptionPane.showMessageDialog(null,iso); 
			String popo = "";
			popo=JOptionPane.showInputDialog("bobo ka ba?");
			String popoo = "Hello  bobo " + popo + "!";
			JOptionPane.showMessageDialog(null,popoo); 
			
	}
}