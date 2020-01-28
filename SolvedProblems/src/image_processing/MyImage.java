package image_processing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImage extends JPanel{
	static final int height = 200;
	static final int width = 200;
	
	static final String input_string = "Hello there";
		
	public void paint(Graphics graphics) {
		Image image = createImageWithText();
		graphics.drawImage(image, 20, 20, this);
	}
	
	public Image createImageWithText() {
		BufferedImage image = new BufferedImage(height, width, BufferedImage.TYPE_INT_BGR);
		Graphics graphics = image.getGraphics();
		
		graphics.drawString(input_string, 20, 20);
		graphics.drawString(input_string, 20, 40);
		graphics.drawString(input_string, 20, 60);
		graphics.drawString(input_string, 20, 80);
		graphics.drawString(input_string, 20, 100);
		
		return image;
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new MyImage());
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
}