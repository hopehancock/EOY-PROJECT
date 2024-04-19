package endofyear;

import javax.swing.ImageIcon;

public class Linnea {

	private int x, y;
	private int dx, dy;
	private int w, h;
	private ImageIcon LinneaImg;
	
	public Linnea() {
		x=900;
		y=800;
		dx=1;
		dy=1;
		w=100;
		h=100;
		LinneaImg = new ImageIcon("spaceship.png");
	}
	
	public Linnea(int xV, int yV, int width, int height, ImageIcon i, int dxV, int dyV) {
		x=xV;
		y=yV;
		dx=dxV;
		dy=dyV;
		w=width;
		h=height;
		LinneaImg = i;
	}
	
	public Linnea(int xV, int yV, ImageIcon i) {
		x=xV;
		y=yV;
		
		w=100;
		h=100;
		LinneaImg = i;
		dx=1;
		dy=1;
	}
	
	public void setX(int xV) {
		x=xV;
	}
	public void setY(int yV) {
		y+=yV;
	}
 	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	public void setW(int width) {
		w=width;
	}
	public void setH(int height) {
		h=height;
	}
	public void setdy(int newdy) {
		dy = newdy;
	}
	public void reverse() {
		dx = dx*-1;
	}
			
	public void setImage(ImageIcon i) {
		LinneaImg= i;
	}
	public int getW() {
		return w;
	}
	public int getH() {
		return h;
	}
	public void move()
	{
		x+=dx;
		y+=dy;
		
	}
	public void reverseAliens() {
		dx=dx*-1;
	}
	public ImageIcon getImg() {
		return LinneaImg;
	}
	/*
	public void setDx(int dxFromGame)
	{
		dx= dxFromGame;
	}*/
}
