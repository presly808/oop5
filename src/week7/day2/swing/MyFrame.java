package week7.day2.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//start init
//standard BorderLayout
public class MyFrame extends JFrame{

	JTextField jTextField = null;
	
	public MyFrame() throws HeadlessException {
		super();
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	
	// initialize components(create objects)
	private void init(){
		GridLayout southGridLayout = new GridLayout(1,2);
		JPanel southPanel = new JPanel(southGridLayout);
		
		GridLayout centralLayout = new GridLayout(1,1);
		JPanel centralPanel = new JPanel(centralLayout);
		
		jTextField = new JTextField();
		JButton loadButton = new JButton("Load");
		
		JButtonAction action = new JButtonAction();
		loadButton.addActionListener(action);
		
		southPanel.add(jTextField);
		southPanel.add(loadButton);
		
		JTextArea textArea = new JTextArea();
		centralPanel.add(textArea);
		

		Container con = getContentPane();
		con.add(centralPanel, BorderLayout.CENTER);
		con.add(southPanel, BorderLayout.SOUTH);
	}
	
	
	private class JButtonAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			jTextField.setText("Button in action");
		}
		
	}	
	
	
}
