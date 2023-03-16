package gamebuildingvideo;
import javax.swing.*;
public class gamescreen {

		private JFrame window;

	

	public gamescreen(gamepanel panel){
	//setting frame/window size
	//note: the video uses "jframe" instead of "window"
		window= new JFrame();
		window.setSize(400,400);
		window.add(panel);
		window.setLocationRelativeTo(null);
		//
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	
}
}
