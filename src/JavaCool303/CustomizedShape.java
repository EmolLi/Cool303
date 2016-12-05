package JavaCool303;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.image.*;

public class CustomizedShape {
	private static final int minTransparency = 10; 
    public static Area createArea(BufferedImage image) {
        Area area = new Area();
        Rectangle rectangle = new Rectangle();
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int rgb = image.getRGB(x, y);
                rgb = rgb >>> 24;
  
				if (rgb >= minTransparency) {
                    rectangle.setBounds(x, y, 1, 1);
                    area.add(new Area(rectangle));
                }
            }
        }
        return area;
    }
}