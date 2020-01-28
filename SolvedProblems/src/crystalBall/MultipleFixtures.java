package crystalBall;

import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class MultipleFixtures {

	static String sourceFile = "C:\\projects\\floorplan.jpg";
	static String destinationFile = "C:\\projects\\floorplanner.jpg";
	
	static File source = new File("C:\\projects\\floorplan.jpg");
	static File source_2 = new File("C:\\projects\\floorplanner.jpg");
	static File target = new File("C:\\projects\\floorplanner.jpg");
	
	static BufferedImage colorImage(BufferedImage image, int h1, int h2, int v1, int v2, boolean flag) {
		int x1 = h1-7;
		int y1 = v1-31;
		int x2 = h2-7;
		int y2 = v2-31;
		WritableRaster raster = image.getRaster();
		for(int i = x1; i < x2; i++) {
			for(int j = y1; j < y2; j++) {
				int pixels[] = raster.getPixel(i, j, (int []) null);
				pixels[0] = 0;
				pixels[1] = 0;
				pixels[2] = 0;
				raster.setPixel(i, j, pixels);
			}
		}
		flag = true;
		return image;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		int iter = scanner.nextInt();
		for(int i = 0; i < iter; i++) {
			int h1 = scanner.nextInt();
			int h2 = scanner.nextInt();
			int v1 = scanner.nextInt();
			int v2 = scanner.nextInt();
			if(flag == false) {
				BufferedImage image = colorImage(ImageIO.read(new File(sourceFile)), h1, h2, v1, v2, flag);
				ImageIO.write(image, "jpg", new File(destinationFile));
				System.out.println("new image generated successfully...");
				
				if(!Desktop.isDesktopSupported()) {
					System.out.println("Desktop not compatible...");
					scanner.close();
					return;
				}
				
				Desktop desktop = Desktop.getDesktop();
				
				if(target.exists()) {
					desktop.open(target);
				}
				
			}
			else {
				BufferedImage image = colorImage(ImageIO.read(new File(destinationFile)), h1, h2, v1, v2, flag);
				ImageIO.write(image, "jpg", new File(destinationFile));
				System.out.println("new image generated successfully...");
				
				if(!Desktop.isDesktopSupported()) {
					System.out.println("Desktop not compatible...");
					scanner.close();
					return;
				}
				
				Desktop desktop = Desktop.getDesktop();
				
				if(target.exists()) {
					desktop.open(target);
				}
			}
		}
		scanner.close();
	}
}
