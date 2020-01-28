package crystalBall;

import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRaster;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ChangeColor extends JFrame implements MouseListener, MouseMotionListener {
	
	String filePath = "C:\\projects\\Capture.jpg";
	
	Desktop desktop = Desktop.getDesktop();
	
	boolean drag_status = false;
	int c1;
	int c2;
	int c3;
	int c4;
	
	public void start() {
		ImagePanel image = new ImagePanel(filePath);
		add(image);
		setSize(image.getWidth(), image.getHeight());
		setVisible(true);
		addMouseListener(this);
		addMouseMotionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Image colorImage(Image image, int c1, int c2, int c3, int c4, int width, int height) {
		BufferedImage newImage = (BufferedImage) image;
		WritableRaster raster = newImage.getRaster();
		c1 = c1-7;
		c2 = c2-31;
		System.out.println(" values of c1 " + c1);
		for (int i = c1; i < c1+width; i++) {
			for (int j = c2; j < c2+height; j++) {
				int pixels[] = raster.getPixel(i, j, (int[]) null);
				pixels[0] = 0;
				pixels[1] = 0;
				pixels[2] = 0;
				raster.setPixel(i, j, pixels);
			}
		}
		return (Image)newImage;
	}
	
	public void draggedScreen() throws Exception {
		int width = Math.abs(c1-c3);
		int height = Math.abs(c2-c4);
		Image image = ImageIO.read(new File(filePath));
		image = colorImage(image, c1, c2, c3, c4, width, height);
		File file = new File("C:\\projects\\newFloorPlan.jpg");
		ImageIO.write((RenderedImage) image, "JPG", file);
		System.out.println("c1 " + c1 + " c2 " + c2 + " width " + width + " height " + height);
		System.out.println("c3 " + c3 +  " c4 " + c4 + "\n");
		System.out.println("New Image successfully created at the location " + file);
		
		if(!Desktop.isDesktopSupported()) {
			System.out.println("Desktop not supported");
			return;
		}
		
		if(file.exists()) {
			desktop.open(file);
		}
	}
	
	public void paint(Graphics graphics) {
		super.paint(graphics);
		int width = Math.abs(c1-c3);
		int height = Math.abs(c2-c4);
		graphics.drawRect(c1, c2, width, height);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		repaint();
		drag_status = true;
		c3 = e.getX();
		c4 = e.getY();
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
		if(drag_status == true) {
			c3 = e.getX();
			c4 = e.getY();
			
			try {
				draggedScreen();
			}
			catch(Exception exception) {
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
		ChangeColor color = new ChangeColor();
		color.start();
	}
}