package image_processing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ImagePanel extends JPanel {
	
	Image image;
	
	public ImagePanel(String image) {
		this(new ImageIcon(image).getImage());
	}
	
	public ImagePanel(Image image) {
		this.image = image;
		Dimension size = new Dimension(image.getWidth(null), image.getHeight(null));
		System.out.println(size);
		setPreferredSize(size);
		setMinimumSize(size);
		setSize(size);
		setLayout(null);
	}
	
	public void paintComponent(Graphics graphics) {
		graphics.drawImage(image,  0,  0, null);
	}
}
