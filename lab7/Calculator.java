package lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
	JLabel result, input;
	JTextField resultArea, inputArea;
	JButton additionButton, substractionButton, multiplicationButton, divisionButton;
	
	
	public Calculator(){
		super("Calculator");
		setLayout(new FlowLayout());
		result = new JLabel("Result");
		add(result);
		resultArea = new JTextField("0",10);
		add(resultArea);
		input = new JLabel("Input");
		add(input);
		inputArea = new JTextField(10);
		inputArea.addActionListener(this);
		add(inputArea);
		additionButton = new JButton("+");
		additionButton.addActionListener(new ButtonEventHandler(this));
		add(additionButton);
		substractionButton = new JButton("-");
		substractionButton.addActionListener(new ButtonEventHandler2(this));
		add(substractionButton);
		multiplicationButton = new JButton("*");
		multiplicationButton.addActionListener(new ButtonEventHandler3(this));
		add(multiplicationButton);
		divisionButton = new JButton("/");
		divisionButton.addActionListener(new ButtonEventHandler4(this));
		add(divisionButton);
		setSize(200,200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event){
		resultArea.setText(event.getActionCommand());
		inputArea.setText("");
	}
	
	public static void main (String args[]){
		Calculator CFrame = new Calculator();
	}


	class ButtonEventHandler implements ActionListener {
		Calculator local_frame;
		
		public ButtonEventHandler(Calculator frame_sent){
			local_frame = frame_sent;
		}
		
		public void actionPerformed(ActionEvent e) {
			String StarterNum, InputNum, result;
			int starternum, inputnum;
			StarterNum = resultArea.getText();
			InputNum = inputArea.getText(); 
			starternum = Integer.parseInt(StarterNum);
			inputnum =Integer.parseInt(InputNum);
			starternum+= inputnum;
			result = Integer.toString(starternum);
			resultArea.setText(result);
			inputArea.setText("");
			//local_frame.resultArea.setText(result);
			//local_frame.inputArea.setText("");
		}
	}
	
	class ButtonEventHandler2 implements ActionListener {
		Calculator local_frame;
		
		public ButtonEventHandler2(Calculator frame_sent){
			local_frame = frame_sent;
		}
		
		public void actionPerformed(ActionEvent e) {
			String StarterNum, InputNum, result;
			int starternum, inputnum;
			StarterNum = resultArea.getText();
			InputNum = inputArea.getText(); 
			starternum = Integer.parseInt(StarterNum);
			inputnum =Integer.parseInt(InputNum);
			starternum-= inputnum;
			result = Integer.toString(starternum);
			resultArea.setText(result);
			inputArea.setText("");
			//local_frame.resultArea.setText(result);
			//local_frame.inputArea.setText("");
		}
	}
	
	class ButtonEventHandler3 implements ActionListener {
		Calculator local_frame;
		
		public ButtonEventHandler3(Calculator frame_sent){
			local_frame = frame_sent;
		}
		
		
		public void actionPerformed(ActionEvent e) {
			String StarterNum, InputNum, result;
			int starternum, inputnum;
			StarterNum = resultArea.getText();
			InputNum = inputArea.getText(); 
			starternum = Integer.parseInt(StarterNum);
			inputnum =Integer.parseInt(InputNum);
			starternum*= inputnum;
			result = Integer.toString(starternum);
			resultArea.setText(result);
			inputArea.setText("");
			//local_frame.resultArea.setText(result);
			//local_frame.inputArea.setText("");
		}
	
	}
	
	class ButtonEventHandler4 implements ActionListener {
		Calculator local_frame;
		
		public ButtonEventHandler4(Calculator frame_sent){
			local_frame = frame_sent;
		}
		
		public void actionPerformed(ActionEvent e) {
			String StarterNum, InputNum, result;
			int starternum, inputnum;
			StarterNum = resultArea.getText();
			InputNum = inputArea.getText(); 
			starternum = Integer.parseInt(StarterNum);
			inputnum =Integer.parseInt(InputNum);
			starternum/= inputnum;
			result = Integer.toString(starternum);
			resultArea.setText(result);
			inputArea.setText("");
			//local_frame.resultArea.setText(result);
			//local_frame.inputArea.setText("");
	
		}
	
	}
}
