/**
 * Everything is inside Box.
 * Box the most outer layer of our UI package.
 * Box creates the window that lays out all the components, such as button, container.
 * Box also take a theme as input, the theme will then be applied to everything inside the box.
 * 
 * 
 */

package JavaCool303;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;


public class Cool303Box extends JFrame implements Cool303Component{

	// all the components inside the box
	private ArrayList<Cool303Component> components;
	// supplied theme
	Cool303Theme theme;
	
	
	/**
	 * constructor of Cool303Box
	 */
	public Cool303Box(){
		super();
		components = new ArrayList<Cool303Component>();
	}
	
	
	/**
	 * add a Cool303Component in the box
	 * @param c Cool303Component
	 */
	public void put(Cool303Component c){
		components.add(c);
	}
	/**
	 * apply theme recursively to a Cool303Component and its children
	 * @param c Cool303Component
	 */
	private void applyTheme(Cool303Component c) {
		c.setTheme(this.theme);
		for (int i=0; i<c.getChildren().size(); i++){
			Cool303Component child = c.getChildren().get(i);
			applyTheme(child);
		}
	}
	
	/**
	 * render box with theme
	 * @param theme Cool303Theme
	 */
	public void render(Cool303Theme theme){
		this.theme = theme;			
		// display the window
		// apply theme

		this.setTheme(theme);
		for (int i=0; i<components.size(); i++){
			Cool303Component c = components.get(i);
			applyTheme(c);
			this.add((Component) c);
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		if (theme.boxIsUndecorated){
			this.setUndecorated(theme.boxIsUndecorated);
			this.setLocationRelativeTo(null);
			setBackground(new Color(0,0,0,0));
		}


	}


	@Override
	public void setTheme(Cool303Theme theme) {
		if (theme.getBoxSize() instanceof Dimension){
			setSize(theme.getBoxSize());
		}
		
	}


	@Override
	public ArrayList<Cool303Component> getChildren() {
		return components;
	}
	
}
