package gamebuildingvideo;
import javax.swing.*;
import inputs.*;
import java.awt.*;

public class gamepanel extends JPanel{

private MouseInputs mouse;
//intitates class naming it mouse

private int xDelta=100, yDelta=100;
//initiates x and y positions, these will change later

private int frames;
//used to find the fps

private long lastCheck =0;


public gamepanel() {
		
	mouse = new MouseInputs(this);
	//in this case "this" refers to the MouseInputs class
	addKeyListener(new KeyboardInputs(this));
	//in this case "this" refers to KeyboardInputs
	addMouseListener(mouse);
	addMouseMotionListener(mouse);
	}
	//generally, "this" refers to the input

//public void setRectPos(int x, int y){
//	this.xDelta=x;
//	this.yDelta=y; 
//	repaint();
//this was in the video but you don't need it 
//}

public void changeXDelta(int value) {
	//for KeyboardInputs
	//to go up -y, go down, +y
	this.xDelta +=value;
	repaint();
}

public void changeYDelta(int value) {
	//for KeyboardInputs
	//to go right +x, to go left, -x
	this.yDelta +=value;
	repaint();
}

public void paintComponent(int x, int y) {
	//refreshes page 
	//paintComponent is also used for the MouseInputs
	//to find
	this.xDelta=x;
	this.yDelta=y;
	repaint();
}



public void paintComponent(Graphics g) {
	super.paintComponent(g);
//calls super class (JPanel) (????)
//will re-run/refresh paintComponent method (it repaints)
	
	g.fillRect(xDelta,yDelta ,200,50);
	
	
//finding fps:
	frames++;
	if(System.currentTimeMillis()- lastCheck >=1000) {
		lastCheck = System.currentTimeMillis();
		System.out.println("FPS: " + frames);
		frames=0;
	}
}




	
}
