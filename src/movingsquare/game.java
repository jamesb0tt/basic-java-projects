package gamebuildingvideo;
public class game {

private gamescreen screen;
private gamepanel panel;
	
public game() {
	
//think of panel and screen as new variables that hold 
//information from the other classes, 
	
panel = new gamepanel();
	//intiates panel as gamepanel
	
screen = new gamescreen(panel);
	//initates screen as the gamescreen class and give it data from gamePanel
	
	panel.requestFocus();
	//sets gamepanel to the focus as oppose to gamescreen
	//(gamescreen is just the window)
		
	}
	
}
	

