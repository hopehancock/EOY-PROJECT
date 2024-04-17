package endofyear;

public class Pictures {

	private String pic;
	private int x;
	private int y;
	private int width;
	private int height;
	private int dx;
	private int dy;
	private boolean movedn;
	private boolean movert;
	
	
	
	public Pictures() {
		pic="";
		x=0;
		y=0;
		width=0;
		height=0;
		dx=1;
		dy=1;
		}
	
	public Pictures(String s, int x1, int y1, int w1, int h1) {
		pic="";
		x=0;
		y=0;
		dx=1;
		dy=1;
		movert=true;
		movedn=false;
		width=0;
		height=0;
			}
	
	
	public Pictures(String s, int x1, int y1, int dx1, int dy1,int w,int h,boolean r, boolean d)
	{
	pic=s;
	x=x1;
	y=y1;
	width=w;
	height=h;
	dx=dx1;
	dy=dy1;
	movert=r;
	movedn=d;
	}

	public void move() {
		if(movert) {
			x+=dx;
		}
		else {
			x-=dx;
		}
		if(movedn) {
			y+=dy;
		}
		else {
			y-=dy;
		}
		
	
		if(x<0)
			movert=true;
		if(x+width>800)
			movert=false;
		
		if (y<0)
			movedn=true;
		if(y+height>600)
			movedn=false;
			}
	
	public String getPic() {
		return pic;
	}
	
	public int getX() {
		return x;	
	}
	public int getY() { 
		return y;
	}
	public int getwidth() {
		return width;
	}
	public int getheight() {
		return height;
	}
	

		
	public void move_stop() {
		x+=dx;
		if(x>300)
			x=300;}
	
	public void bounce() {
		if(movert) {
			x+=dx;
	}
		else {
			x-=dx;
		}
		if(movedn) {
			y+=dy;
		}
		else {
			y-=dy;
		}
		if(x<0)
			movert=true;
		if(x+width>800)
			movert=false;
		if(y<0)
		movedn=true;
		if(y+height>600)
			movedn=false;
				
}
			
		
	}

	
