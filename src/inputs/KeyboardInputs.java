package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import movingsquare.gamepanel;

public class KeyboardInputs implements KeyListener{

	private gamepanel panel;
	public KeyboardInputs(gamepanel panel) {
		this.panel = panel;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			//will check for specific keys
		
//think of the cases as if statements that you must break each time
		case KeyEvent.VK_W:
		panel.changeYDelta(-5);
			break;
			
		case KeyEvent.VK_A:
	panel.changeXDelta(-5);
			break;
			
		case KeyEvent.VK_S:
		
	panel.changeYDelta(+5);
			break;
		case KeyEvent.VK_D:
		panel.changeXDelta(+5);
			break;
		
			
		
		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
