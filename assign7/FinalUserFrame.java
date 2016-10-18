package assign7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class FinalUserFrame extends JFrame{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel EnterCountry;
	private JTextField InputArea;
	private JTextArea OutputArea;
	private JButton ShowStudent, ShowAscending, ShowDecending;
	private University temp;
	private OutputFrame Ascending, Descending;
	
	public FinalUserFrame(final University U){
		super("Input Frame");
		setLayout(new FlowLayout());
		temp = U;
		EnterCountry = new JLabel("Enter name of Country");
		add(EnterCountry);
		InputArea = new JTextField(25);
		InputArea.addActionListener(new ActionListener(){
			@Override 
			public void actionPerformed(ActionEvent event){
				String input = InputArea.getText();
				int num = temp.numberOfStudents(input);
				input = Integer.toString(num);
				OutputArea.setText("Number of Students from " + InputArea.getText()+" is " + input);
				InputArea.setText("");
			}
		});
		add(InputArea);
		OutputArea = new JTextArea(20,50);
		add(OutputArea);
		ShowStudent = new JButton("Show Students");
		ShowStudent.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				String output = String.valueOf(U);
				OutputArea.setText(output);
			}
		});
		add(ShowStudent);
		ShowAscending = new JButton("Show Students Sorted (ascending)");
		ShowAscending.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				U.sortStudents();
				Ascending = new OutputFrame("Sorted List (Ascending) of Students");
				Ascending.displayMessage(String.valueOf(U));
			}
		});
		add(ShowAscending);
		ShowDecending = new JButton("Show Students Sorted (descending)");
		ShowDecending.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				U.sortStudentsInReverse();
				Descending = new OutputFrame("Sorted List (Descending) of Students");
				Descending.displayMessage(String.valueOf(U));
			}
		});
		add(ShowDecending);
		setSize(650,480);
		setVisible(true);
	}


	public void actionPerformed(ActionEvent e) {
		OutputArea.setText(e.getActionCommand());
		InputArea.setText("");
	}
}
