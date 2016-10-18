package lab10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Laboratory10ToChange  extends JFrame implements ActionListener{
	JLabel prompt, outputPrompt;
	JTextField inputArea, outputArea;
	JButton myButton;
	MyObject obj;
	public Laboratory10ToChange() throws DivideByZeroException, ArrayIndexOutOfBoundsException{
		  super (" Laboratory 10 - EXCEPTIONS");
		  setLayout(new FlowLayout());
		  prompt = new JLabel ("Enter an Integer and Press CR");
		  add(prompt);
		  inputArea = new JTextField(15);
		  
			  inputArea.addActionListener(this);
			  add(inputArea);  
			  myButton = new JButton("Calculate Average");
			  myButton.addActionListener(this);
			  add(myButton);
			  outputPrompt = new JLabel ("The Average of the Numbers is");
			  add(outputPrompt);
			  outputArea = new JTextField(15);
			  add(outputArea);
			  obj = new MyObject();
			 
		  
		 
		  setSize(250, 350);
		  setVisible(true);   
	}
	public void actionPerformed( ActionEvent e ){
		try{	
			if (e.getSource() == inputArea){
				obj.insert(Integer.parseInt(e.getActionCommand()));
				inputArea.setText("");
			}
			if (e.getSource() == myButton){
				double average = obj.calcAverage();
				outputArea.setText(Double.toString(average));
			}
		}	
		catch(DivideByZeroException e1){
			System.out.println(e1.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e2){
			System.out.println(e2.getMessage());
		}
		catch(NumberFormatException e3){
			  System.out.println("Not an Integer");
		}
	}
	
	public static void main( String args[] ){
		Laboratory10ToChange lab = new Laboratory10ToChange();
	}

}