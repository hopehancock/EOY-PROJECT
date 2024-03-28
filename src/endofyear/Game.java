package endofyear;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

	public class Game extends JPanel implements Runnable,KeyListener{
		private static final Image ImageIcon = null;
		private BufferedImage back;
		private int key;

		
		public Game() {
			back=null;
			new Thread(this).start();
			this.addKeyListener(this);
			key=-1;
		}

		public void run() {
			try {
				while(true) {
					Thread.currentThread().sleep(5);
					repaint();
				}
			}
			catch(Exception e) {}
		}
		
		public void paint (Graphics g)
		{
			Graphics2D twoDgraph = (Graphics2D)g;
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
			if (back==null) {
				back =(BufferedImage) (createImage(getWidth(), getHeight()));
					}

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
			Graphics g2d = back.createGraphics();
			
			//this clears the old image, like an EtchASketch. If you see the old image when we learn motion, you deleted this line.
			g2d.clearRect(0, 0, getSize().width, getSize().height); 
			
			//START CODING GRAPHICS HERE 

		
			
			//This line tells the program to draw everything above. If you delete this, nothing will show up.
			twoDgraph.drawImage(back, 0, 0, null);}
			// TODO Auto-generated method stub
							
	

		
		
			
	public void keyPressed(KeyEvent e) {}
	
	public void keyTyped(KeyEvent e) { }

	public void keyReleased(KeyEvent e) {}

	}