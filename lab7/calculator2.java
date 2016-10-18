package lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator2 extends JFrame implements ActionListener{
	private int currentResult = 0;
	private int numberEnteredByUser = 0;
	private JTextField outputArea;
	private JTextField inputArea;
	private JLabel label1, label2;
	private JButton[] operationButtons;

	
	public void actionPerformed(ActionEvent e) {
		char operation;
		operation = e.getActionCommand().charAt(0);
		String stringToDisplay;
		numberEnteredByUser = Integer.parseInt(inputArea.getText());
		switch (operation){
		case '+': currentResult += numberEnteredByUser;
		break;
		case '-': currentResult -= numberEnteredByUser;
		break;
		case '*': currentResult *= numberEnteredByUser;
		break;
		case '/': currentResult /= numberEnteredByUser;
		break;
		default:break;
		}
		stringToDisplay = String.valueOf(currentResult);
		outputArea.setText(stringToDisplay);
		inputArea.setText("");
	}
	public calculator2(){
		super("Calculator");
		
		char operatorArray[] = {'+', '-', '*', '/'};
		
		setLayout(new FlowLayout());
		label1 = new JLabel("Result");
		add(label1);
		outputArea = new JTextField(10);
		add(outputArea);
		outputArea.setText("0");
		label2 = new JLabel("Input");
		add(label2);
		inputArea = new JTextField(10);
		inputArea.addActionListener(this);
		add(inputArea);
		operationButtons = new JButton[4];
		
		for (int i = 0; i < 4; i++){
			operationButtons[i] = new JButton(String.valueOf(operatorArray[i]));
			//operationButtons[i].setText(String.valueOf(operatorArray[i]));
			operationButtons[i].addActionListener(this);
			add(operationButtons[i]);
		}
		setSize(200, 160);
		setVisible(true);
	}
	public static void main(String args[]){
		Calculator aFrame = new Calculator();
	}
}

