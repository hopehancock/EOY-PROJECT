package endofyear;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Game extends JPanel implements Runnable, KeyListener {
    private BufferedImage back;
    private int key;
    private Background_Image bi;
    private ImageIcon background;
    private ArrayList<Pictures> imageList;
    private Pictures linnea;

    public Game() {
        back = null;
        new Thread(this).start();
        this.addKeyListener(this);
        bi = new Background_Image();
        background = new ImageIcon(bi.getBackground());
        linnea = new Pictures("linnea.png", 270, 170, 0, 0, 250, 250, false, false); // Centered and smaller

        key = -1;
        imageList = new ArrayList<>();
        createimagelist();
    }

    public void createimagelist() {
        imageList.add(new Pictures("s1.png", 300, 400, 1, 1, 100, 100, false, true));
        imageList.add(new Pictures("s2.png", 100, 590, 1, 1, 100, 100, true, true));
        imageList.add(new Pictures("s3.png", 600, 300, 1, 1, 200, 200, false, false));
        imageList.add(new Pictures("s4.png", 700, 10, 1, 1, 100, 100, true, false));
        imageList.add(new Pictures("s5.png", 20, 80, 1, 1, 80, 120, false, true));
    }

    public void run() {
        try {
            while (true) {
                Thread.currentThread().sleep(5);
                repaint();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D twoDgraph = (Graphics2D) g;
        if (back == null) {
            back = (BufferedImage) (createImage(getWidth(), getHeight()));
        }

        Graphics g2d = back.createGraphics();

        g2d.clearRect(0, 0, getSize().width, getSize().height);

        g2d.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
        g2d.drawImage(new ImageIcon(linnea.getPic()).getImage(), linnea.getX(), linnea.getY(), linnea.getWidth(), linnea.getHeight(), this); // Centered and smaller
        g2d.setColor(Color.WHITE);
		g2d.setFont(new Font("Georgia",Font.BOLD,90));
		g2d.drawString("FIND LINNEA!!!", 20, 90);	
		

        displayimages(g2d);
        move();

        twoDgraph.drawImage(back, 0, 0, null);
    }

    public void displayimages(Graphics g2d) {
        for (Pictures b : imageList) {
            g2d.drawImage(new ImageIcon(b.getPic()).getImage(), b.getX(), b.getY(), b.getWidth(), b.getHeight(), this);
        }
    }

    public void move() {
        for (Pictures b : imageList) {
            b.bounce();
        }
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
        key = e.getKeyCode();
        System.out.println(key);
        if (key == 32) ;
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Game");
        Game game = new Game();
        frame.add(game);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
