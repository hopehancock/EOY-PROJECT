	package endofyear;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.awt.image.BufferedImage;
	import java.util.*;

	public class Game extends JPanel implements Runnable,KeyListener{
		private static final Image ImageIcon = null;
		private BufferedImage back;
		private int key;
		private ArrayList<Pictures>imageList;

		
		public Game() {
			back=null;
			new Thread(this).start();
			this.addKeyListener(this);
			key=-1;
			imageList=new ArrayList<Pictures>();
			createimagelist();
			}
		
	public void createimagelist() {
        imageList.add(new Pictures("s1.png",300,400,1,1,100,100,false,true));
        imageList.add(new Pictures("s2.png",100,590,1,1,100,100,true,true));
        imageList.add(new Pictures("s3.png",600,300,1,1,200,200,false,false));
        imageList.add(new Pictures("s4.png",700,10,1,1,100,100,true,false));
        imageList.add(new Pictures("s5.png",20,80,1,1,80,120,false,true));
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

			g2d.setColor(Color.CYAN);
			
			displayimages(g2d);
			move();
			
			//This line tells the program to draw everything above. If you delete this, nothing will show up.
			twoDgraph.drawImage(back, 0, 0, null);} {
			// TODO Auto-generated method stub
							
			}
		public void displayimages(Graphics g2d) {
			for(Pictures b:imageList) {
				g2d.drawImage(new ImageIcon(b.getPic()).getImage(),b.getX(),b.getY(), b.getwidth(), b.getheight(), this);
			}

		}
		

		
			public void move() {
				for(Pictures b:imageList){
				b.bounce();	
				}
			}
			
	public void keyPressed(KeyEvent e) {}
	
	public void keyTyped(KeyEvent e) {
		
		key=e.getKeyCode();
		System.out.println(key);
		if(key==32);
	}

	public void keyReleased(KeyEvent e) {}

	}