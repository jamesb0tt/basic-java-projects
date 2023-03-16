package inputs;

import java.awt.event.*;

import movingsquare.gamepanel;

public class MouseInputs implements MouseListener, MouseMotionListener  {

	private gamepanel panel;
		public MouseInputs(gamepanel panel) {
		this.panel = panel;
		}
		@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		panel.paintComponent(e.getX(), e.getY());
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		//CLICKED = PRESSED AND RELEASED
		System.out.println("mouse clicked");
		 
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}

}
