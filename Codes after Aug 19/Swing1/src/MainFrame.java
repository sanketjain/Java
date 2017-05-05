import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
//Task of Layout Manager is to decide where to put components in window and also to move components and resize as per expand/condense.

public class MainFrame extends JFrame {

	private JButton btn;
	//private JTextArea textArea;
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel formPanel;
	
	public MainFrame(){ //Constructor
		super("Hello World"); //Call super class constructor. equivalent to: JFrame frame = new JFrame("Hello World");
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
//		btn = new JButton("Click Me");
		textPanel = new TextPanel();
//		textArea = new JTextArea();		
		formPanel = new FormPanel();
		
//		toolbar.setTextPanel(textPanel);
		
/*		btn.addActionListener(new ActionListener() { //Add functionality to button when we click it :)
			public void actionPerformed(ActionEvent arg0) {
			//	textArea.append("Hello\n");
				textPanel.appendText("Hello\n");			
			}			
		});
*/
		
		toolbar.setStringListener(new StringListener(){
			public void textEmitted(String text) {
				//System.out.println(text);
				textPanel.appendText(text);
			}			
		});
		
		formPanel.setFormListener(new FormListener(){
			public void formEventOccurred(FormEvent e){
				String name = e.getName();
				String occupation = e.getOccupation();
				
				textPanel.appendText(name + ": " + occupation + "\n");
			}
		});

		//add(textArea, BorderLayout.CENTER);
		add(formPanel, BorderLayout.WEST); //Adds Panel on west side
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		//add(btn, BorderLayout.SOUTH);
		
		setSize(600, 500); //Set size of window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This would close the App.java as we exit HelloWorld window,
		//w/o it app continues to run.
		setVisible(true);				
	
	}
}
