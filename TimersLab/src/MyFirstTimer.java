import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class MyFirstTimer extends GraphicsProgram {
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	
	public void run(){
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
	}
}



