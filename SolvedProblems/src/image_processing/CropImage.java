package image_processing;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CropImage extends JFrame implements MouseListener, MouseMotionListener {
	
	int drag_status = 0;
	int c1;
	int c2;
	int c3;
	int c4;
	
	public void start() {
		ImagePanel image = new ImagePanel("C:\\projects\\Capture.jpg");
		add(image);
		setSize(692, 639);
		setVisible(true);
		addMouseListener(this);
		addMouseMotionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void draggedScreen() throws Exception {
		int width = Math.abs(c1-c3);
		int height = Math.abs(c2-c4);
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(new Rectangle(c1, c2, width, height));
		System.out.println("c1 " + c1 + " c2 " + c2 + " width " + width + " height " + height);
		System.out.println("c3 " + c3 + " c4 " + c4);
		File file = new File("C:\\projects\\cropped_image.jpg");
		ImageIO.write(image, "JPG", file);
		System.out.println("cropped image saved successfully");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		repaint();
		drag_status = 1;
		c3 = e.getX();
		c4 = e.getY();
	}
	
	public void paint(Graphics graphics) {
		super.paint(graphics);
		int width = Math.abs(c1-c3);
		int height = Math.abs(c2-c4);
		graphics.drawRect(c1, c2, width, height);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		repaint();
		c1 = e.getX();
		c2 = e.getY();	
		}

	@Override
	public void mouseReleased(MouseEvent e) {
		repaint();
		if(drag_status == 1) {
			c3 = e.getX();
			c4 = e.getY();
			
			try {
				draggedScreen();
			}
			catch(Exception exception){
				System.out.println(exception.getMessage());
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
	public static void main(String[] args) {
		new CropImage().start();
	}
	
}
