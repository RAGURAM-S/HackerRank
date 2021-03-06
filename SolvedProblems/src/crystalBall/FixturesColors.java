package crystalBall;

import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.imageio.ImageIO;

public class FixturesColors{
	
	static String sourceFile = "C:\\projects\\floorplan.jpg";
	static String destinationFile = "C:\\projects\\floorplanner.jpg";
	
	static File source = new File("C:\\projects\\floorplan.jpg");
	static File target = new File("C:\\projects\\floorplanner.jpg");
	
	static BufferedImage colorImage(BufferedImage image, int h1, int h2, int v1, int v2) {
		int x1 = h1-7;
		int y1 = v1-31;
		int x2 = h2-7;;
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
		return image;
	}
	
	public static void main(String[] args) throws Exception {
		
		Products X = new Products(2001, "X", 1001);
		Products Y = new Products(2002, "Y", 1002);
		Products Z = new Products(2003, "Z", 1003);
		ArrayList<Integer> products_array = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(2001, 1001);
		map.put(2002, 1002);
		map.put(2003, 1003);
		products_array.add(2001);
		products_array.add(2002);
		products_array.add(2003);
		
		Fixtures A = new Fixtures(1001, "A", 609, 642, 254, 377);
		Fixtures B = new Fixtures(1002, "B", 609, 642, 475, 551);
		Fixtures C = new Fixtures(1003, "C", 54, 78, 451, 478);
		ArrayList<Integer> fixtures_array = new ArrayList<Integer>();
		fixtures_array.add(1001);
		fixtures_array.add(1002);
		fixtures_array.add(1003);
		
		BufferedImage image = colorImage(ImageIO.read(new File(sourceFile)), A.getX1(), A.getX2(), A.getY1(), A.getY2());
		image = colorImage(image, B.getX1() ,B.getX2(), B.getY1(), B.getY2());
		image = colorImage(image, C.getX1(), C.getX2(), C.getY1(), C.getY2());
		
		ImageIO.write(image, "jpg", new File(destinationFile));
		System.out.println("new image has been rendered successfully...");
		
		if(!Desktop.isDesktopSupported()) {
			System.out.println("Desktop is not compatible...");
			return;
		}
		
		Desktop desktop = Desktop.getDesktop();
		
		if(target.exists()) {
			desktop.open(target);
		}
	}
}