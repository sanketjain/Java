import java.awt.BorderLayout;

import javax.swing.JPanel; //Panel are gray flat areas in program. They are used to add components. 
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextPanel extends JPanel {
	
	private JTextArea textArea;
	
	public TextPanel(){
		textArea = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(textArea), BorderLayout.CENTER); //JScrollPane to get scroll bars if the text size exceeds the box
	}
	
	public void appendText(String text) {
		textArea.append(text);
	}

}
