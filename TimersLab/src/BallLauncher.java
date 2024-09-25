import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

import acm.graphics.*;
import acm.program.*;

public class BallLauncher extends GraphicsProgram {
	public static final int SIZE = 25;
	
	public void run() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		GOval ball = makeBall(SIZE/2, e.getY());
		add(ball);
	}
	
	public GOval makeBall(double x, double y) {
		GOval temp = new GOval(x-SIZE/2, y-SIZE/2, SIZE, SIZE);
		temp.setColor(Color.RED);
		temp.setFilled(true);
		return temp;
	}
}
