package lab8;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle2 {
	Coordinate center; // A Rectangle is defined by its color, radius and the top left corner of the bounding box for the Rectangle
	Coordinate lastMousePosition;
	int circumscribedRadius, partheight, partwidth;
	Color RectangleColor; 
	boolean RectangleIsSelectedForMoving = false; // true if the user presses mouse button inside the Rectangle
	boolean bottomperimeterSelected = false; // true if the user presses mouse button on the perimeter of the Rectangle
	boolean rightperimeterSelected = false;
	boolean leftperimeterSelected = false;
	boolean topperimeterSelected = false;
	
	
	public Rectangle2(){
		center = new Coordinate(100, 100); // initial definition of the Rectangle
		partwidth = (center.getX())/2;//width = 100
		partheight = (center.getY())/4;//height = 50
		RectangleColor = Color.RED;
	}
	
	public void processMouseMotionEvent(Coordinate currentMousePosition){// called when the user drags the mouse
		if (RectangleIsSelectedForMoving){// If the Rectangle is selected for moving
			updateRectanglePosition(currentMousePosition); // Find new position of Rectangle
		} else if (bottomperimeterSelected){// if the perimeter of the Rectangle is selected for modifying the size of Rectangle
			updatebottomHeight(currentMousePosition); // Find new radius of Rectangle and update the size of Rectangle
		}else if (rightperimeterSelected){
			updaterightWidth(currentMousePosition);
		}else if (leftperimeterSelected){
			updateleftWidth(currentMousePosition);
		}else if (topperimeterSelected){
			updatetopHeight(currentMousePosition);
		}
	}
    
	public void processMouseReleasedEvent(Coordinate currentMousePosition){// called when the user releases the left mouse button
    	RectangleColor = Color.RED;              // the color becomes red again and all flags 
		RectangleIsSelectedForMoving = false;             // are reset.
		bottomperimeterSelected = false;
		rightperimeterSelected = false;
		leftperimeterSelected = false;
		topperimeterSelected = false;
    }
	
	public void processMousePressedEvent(Coordinate currentMousePosition){// called when the user presses the left mouse button
		lastMousePosition = currentMousePosition;// save the current position of the button so that subsequent mouse drag event 
		                                         // can be handled
		if (onPerimeterbottom(lastMousePosition)){ // If the user selects the circumference of the Rectangle
			bottomperimeterSelected = true;             // by pressing the mouse within 5 pixels of the perimeter the corresponding flag is set to true and 
		    RectangleColor = Color.BLUE;  			 // the color becomes blue
		}else if(onPerimeterright(lastMousePosition)){
			rightperimeterSelected = true;
			RectangleColor = Color.BLUE;
		}else if(onPerimeterleft(lastMousePosition)){
			leftperimeterSelected = true;
			RectangleColor = Color.BLUE;
		}else if(onPerimetertop(lastMousePosition)){
			topperimeterSelected = true;
			RectangleColor = Color.BLUE;
		}else if (RectangleIsSelected(lastMousePosition)){ // If Rectangle is selected 
			RectangleIsSelectedForMoving = true;     // the corresponding flag is set to true and 
			RectangleColor = Color.GREEN;            //the color of the Rectangle becomes green
		}
	}	
	private void updateRectanglePosition(Coordinate newMousePosition){// This method is called when the user selects the Rectangle
		                                                           // for moving and has then dragged the mouse
		int newXValue, newYValue; // gives the x value and the y value of the new center of the Rectangle
		newXValue = center.getX() + newMousePosition.getX() - lastMousePosition.getX();
		newYValue = center.getY() + newMousePosition.getY() - lastMousePosition.getY();
		center = new Coordinate(newXValue, newYValue); // get the new position of center of Rectangle
		lastMousePosition = newMousePosition; // get the new position of center of Rectangle
	}
	
	private void updatebottomHeight(Coordinate newMousePosition){// method is called to modify the size of Rectangle
		int newYValue;
		newYValue = newMousePosition.getY();
		partheight = (newYValue-center.getY());
	}
	
	private void updaterightWidth(Coordinate newMousePosition){// method is called to modify the size of Rectangle
		int newXValue;
		newXValue = newMousePosition.getX();
		partwidth = (newXValue-center.getX());
	}
	private void updateleftWidth(Coordinate newMousePosition){// method is called to modify the size of Rectangle
		int newXValue;
		newXValue = newMousePosition.getX();
		partwidth = (center.getX()-newXValue);
	}
	private void updatetopHeight(Coordinate newMousePosition){// method is called to modify the size of Rectangle
		int newYValue;
		newYValue = newMousePosition.getY();
		partheight = (center.getY()-newYValue);
	}
		
	private boolean  RectangleIsSelected(Coordinate point){// method is called to check if the user has pressed mouse button
		double bottomline = center.getY() + partheight;
		double leftline = center.getX() - partwidth;
		double rightline = center.getX() + partwidth; 
		double topline = center.getY() - partheight;
		
		if(point.getY() < bottomline+5 && point.getY() > topline-5 && point.getX() > leftline-5 && point.getX() < rightline+5) {
			return true;
		}else{
			return false;
		}
		
	} 

	private boolean onPerimeterright(Coordinate point){ // method is called to check if the user has pressed mouse button
		double bottomline = center.getY() + partheight;
		double rightline = center.getX() + partwidth; 
		double topline = center.getY() - partheight;
		
		if((rightline-5 <= point.getX()) && (rightline+5 >= point.getX()) && (topline-5 <= point.getY()) && (bottomline +5 >= point.getY())){
			return true;
		}
		return false;
	}
	
	private boolean onPerimeterbottom(Coordinate point){ // method is called to check if the user has pressed mouse button
		double bottomline = center.getY() + partheight;
		double leftline = center.getX() - partwidth;
		double rightline = center.getX() + partwidth; 
		if((bottomline-5 <= point.getY()) && (bottomline+5 >= point.getY()) && (rightline+5 >= point.getX()) && (leftline -5 <= point.getX())){
			return true;
		}	
		return false;
	}
	
	private boolean onPerimetertop(Coordinate point){ // method is called to check if the user has pressed mouse button
		double leftline = center.getX() - partwidth;
		double rightline = center.getX() + partwidth; 
		double topline = center.getY() - partheight;
		
		if((topline-5 <= point.getY()) && (topline+5 >= point.getY()) && (rightline+5 >= point.getX()) && (leftline -5 <= point.getX())){
			return true;
		}	
		return false;
	}
	
	private boolean onPerimeterleft(Coordinate point){ // method is called to check if the user has pressed mouse button
		double bottomline = center.getY() + partheight;
		double leftline = center.getX() - partwidth;
		double topline = center.getY() - partheight;
		
		if((leftline-5 <= point.getX()) && (leftline+5 >= point.getX()) && (topline-5 <= point.getY()) && (bottomline +5 >= point.getY())){
			return true;
		}
		return false;
		}
	
	public void showRectangle(Graphics g){	// display the cirle with the specified color, size and center
		g.setColor(RectangleColor);
		g.drawRect(center.getX() - partwidth, center.getY() - partheight, partwidth*2, partheight*2);
	}
}