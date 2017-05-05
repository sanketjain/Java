import javax.swing.JFrame;
import javax.swing.SwingUtilities;
//Ctrl+Sft+O would organize imports, it is a way to add imports
public class App {

	public static void main(String[] args) {
		
		//It's said in general to run swing app in a special thread 
		//So we use static method SwingUtilities class
		
		SwingUtilities.invokeLater(new Runnable() { //InvokeLater class implements runnable interface
			//Runnable interface has method called public void run

			public void run() {
				new MainFrame();

			} 
		});		
	}

}

