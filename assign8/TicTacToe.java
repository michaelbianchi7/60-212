package assign8;

import java.awt.*;    
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.*;

public class TicTacToe  extends JFrame {
	Coordinate lastMousePosition;
	private int turn=1; // turn is 1 if it is the turn to display a X, 2  if it is the turn to display O
 	private int rowNumber;// gives the row and column where the new move is to be displayed
	private int columnNumber;
	private double leftwall=40.0;
	private double rightwall = 140.0;
	private double bottomwall = 207.0;
	private double topwall = 107.0;
	int xTable[] = {46, 79, 113};   // xTable[i] gives the displacement for rowNumber i
	int yTable[] = {113, 146, 180};
	boolean makeboardnull = false, temp = false;
	static int i=0;
	int Array [][] = new int[3][3];
	
	
	public TicTacToe(){
		TicTacToe board; 
		board = new TicTacToe(rowNumber, columnNumber, turn);
		board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public TicTacToe(int rowNumber, int columnNumber, int turn){
		super("Tictactoe Board"); 
		setSize(300, 300); 
		setVisible(true);
		this.rowNumber = rowNumber;
		this.columnNumber = columnNumber;
		this.turn = turn;
		
		addMouseListener( new MouseAdapter(){
			public void mousePressed(MouseEvent e ){
				Coordinate currentMousePosition;
				int xValue, yValue;
				xValue = e.getX();
				yValue = e.getY();
				currentMousePosition = new Coordinate(xValue, yValue);
				processMousePressedEvent(currentMousePosition);
				repaint();
			}
			public void mouseReleased(MouseEvent e ){ 
				Coordinate currentMousePosition;
				int xValue, yValue;
				xValue = e.getX();
				yValue = e.getY();
				currentMousePosition = new Coordinate(xValue, yValue);
				processMouseReleasedEvent(currentMousePosition);
				repaint();
			}
		});
	
		addMouseMotionListener( new MouseMotionAdapter(){
			public void mouseDragged( MouseEvent e ){ 
				int xValue, yValue;
				Coordinate currentMousePosition;
				xValue = e.getX();                      
				yValue = e.getY();
				currentMousePosition = new Coordinate(xValue, yValue);
				processMouseMotionEvent(currentMousePosition);
				repaint();
			}
		}
		);
	}
	@Override
	public void paint(Graphics g){
		int red = 255, green = 0, blue = 0;
		Font my_font; 
		my_font = new Font( "Serif", Font.BOLD, 18 ); 
		super.paint(g); 
		g.setColor(new Color(red, green, blue)); 
		g.drawLine(40, 140, 140, 140);
		g.drawLine(40, 173, 140, 173);
		g.drawLine(73, 107, 73, 207);
		g.drawLine(107, 107, 107, 207);
		g.setColor(new Color(0, 0, 0));
		g.fillRect(20, 87, 140, 5);
		g.fillRect(20, 87, 5, 140);
		g.fillRect(20, 222, 140, 5);
		g.fillRect(155, 87, 5, 140);
		g.setColor(Color.blue);       
		g.setFont(my_font);
		g.drawString("My Tic Tac Toe Board", 20, 280);
		displayMoves(g); 
		}
	
	private void displayMoves(Graphics g){
		for(int x = 0; x<3; x++){
			for(int y = 0; y<3; y++){
				System.out.println("" + x + " " + y + " " + Array[x][y] + " " + System.currentTimeMillis());
				if (Array[x][y] == 1){
					drawX(g, x, y);		
				} 
				else if(Array[x][y] ==2){
					drawCircle(g, x, y);				
				} 
			}
		}
		
		if(temp){
			if(turn == 0) return;
			
			if(Array[rowNumber][columnNumber] == 0){
				if (turn == 1){
					drawX(g, rowNumber, columnNumber);		
				} 
				else if(turn == 2){
					drawCircle(g, rowNumber, columnNumber);				
				} 
			}
		}
	}

	public void drawX(Graphics g, int rowNo, int columnNo){
		g.drawLine(xTable[columnNo], yTable[rowNo], 
			    xTable[columnNo] + 10, yTable[rowNo] + 20);
		g.drawLine(xTable[columnNo], yTable[rowNo] + 20, 
				xTable[columnNo] + 10, yTable[rowNo]);	   
	
	}

	private void drawCircle(Graphics g, int rowNo, int columnNo){
		g.drawOval(xTable[columnNo], yTable[rowNo], 20, 20);	   
		
	}
	
	private void updatePosition(Coordinate newMousePosition){
        lastMousePosition = newMousePosition;
	}
	
	public void ifelsestatements(Coordinate currentMousePosition){
		if (zerozero(lastMousePosition)){ 
			rowNumber = 0;
			columnNumber = 0;
		}else if (zeroone(lastMousePosition)){ 
			rowNumber = 0;
			columnNumber = 1;
			
		}else if (zerotwo(lastMousePosition)){ 
			rowNumber = 0;
			columnNumber = 2;
			
		}else if (onezero(lastMousePosition)){ 
			rowNumber = 1;
			columnNumber = 0;
			
		}else if (oneone(lastMousePosition)){ 
			rowNumber = 1;
			columnNumber = 1;
			
			
		}else if (onetwo(lastMousePosition)){ 
			rowNumber = 1;
			columnNumber = 2;
			
			
		}else if (twozero(lastMousePosition)){ 
			rowNumber = 2;
			columnNumber = 0;
		}else if (twoone(lastMousePosition)){ 
			rowNumber = 2;
			columnNumber = 1;
			
		}else if (twotwo(lastMousePosition)){ 
			rowNumber = 2;
			columnNumber = 2;
			
		}
	}
	
	public void processMouseMotionEvent(Coordinate currentMousePosition){// called when the user drags the mouse
		lastMousePosition = currentMousePosition;
		temp = true;
		ifelsestatements(lastMousePosition);
	}
	
	public void processMouseReleasedEvent(Coordinate currentMousePosition){// called when the user releases the left mouse button
		temp = false;
		ifelsestatements(currentMousePosition);
		if(Array[rowNumber][columnNumber] == 0){
			Array [rowNumber][columnNumber] = turn;
			if(turn == 1)turn = 2;
			else if(turn == 2)turn = 1;
		}
	}
	
	public void processMousePressedEvent(Coordinate currentMousePosition){
		lastMousePosition = currentMousePosition;
		temp = true;
		
		
		ifelsestatements(lastMousePosition);
		
		
	}	
	
	public boolean zerozero(Coordinate point){
		double innerrightwall = 73.0;
		double innerbottomwall = 140.0;
		if(leftwall+5 <= point.getX() && innerrightwall-5 >= point.getX() && topwall+5 <= point.getY() && innerbottomwall-5 >= point.getY()){
			return true;
		}else{
			return false;
		}
	}
	public boolean zeroone(Coordinate point){
		double innerleftwall=73.0;
		double innerrightwall = 107.0;
		double innerbottomwall = 140.0;
		if(innerleftwall+5 <= point.getX() && innerrightwall-5 >= point.getX() && topwall+5 <= point.getY() && innerbottomwall-5 >= point.getY()){
			return true;
		}else{
			return false;
		}
	}
	public boolean zerotwo(Coordinate point){
		double innerleftwall=107.0;
		double innerbottomwall = 140.0;
		if(innerleftwall+5 <= point.getX() && rightwall-5 >= point.getX() && topwall+5 <= point.getY() && innerbottomwall-5 >= point.getY()){
			return true;
		}else{
			return false;
		}
	}
	public boolean onezero(Coordinate point){
		double innertopwall = 140.0;
		double innerrightwall = 73.0;
		double innerbottomwall = 173.0;
		if(leftwall+5 <= point.getX() && innerrightwall-5 >= point.getX() && innertopwall+5 <= point.getY() && innerbottomwall-5 >= point.getY()){
			return true;
		}else{
			return false;
		}
	}
	public boolean oneone(Coordinate point){
		double innerleftwall=73.0;
		double innertopwall = 140.0;
		double innerrightwall = 107.0;
		double innerbottomwall = 173.0;
		if(innerleftwall+5 <= point.getX() && innerrightwall-5 >= point.getX() && innertopwall+5 <= point.getY() && innerbottomwall-5 >= point.getY()){
			return true;
		}else{
			return false;
		}
	}
	public boolean onetwo(Coordinate point){
		double innerleftwall=107.0;
		double innertopwall = 140.0;
		double innerbottomwall = 173.0;
		if(innerleftwall+5 <= point.getX() && rightwall-5 >= point.getX() && innertopwall+5 <= point.getY() && innerbottomwall-5 >= point.getY()){
			return true;
		}else{
			return false;
		}
	}
	public boolean twozero(Coordinate point){
		double innertopwall = 173.0;
		double innerrightwall = 73.0;
		if(leftwall+5 <= point.getX() && innerrightwall-5 >= point.getX() && innertopwall+5 <= point.getY() && bottomwall-5 >= point.getY()){
			return true;
		}else{
			return false;
		}
	}
	public boolean twoone(Coordinate point){
		double innerleftwall=73.0;
		double innertopwall = 173.0;
		double innerrightwall = 107.0;
		if(innerleftwall+5 <= point.getX() && innerrightwall-5 >= point.getX() && innertopwall+5 <= point.getY() && bottomwall-5 >= point.getY()){
			return true;
		}else{
			return false;
		}
	}
	public boolean twotwo(Coordinate point){
		double innerleftwall=107.0;
		double innertopwall = 173.0;
		if(innerleftwall+5 <= point.getX() && rightwall-5 >= point.getX() && innertopwall+5 <= point.getY() && bottomwall-5 >= point.getY()){
			return true;
		}else{
			return false;
		}
	}
}