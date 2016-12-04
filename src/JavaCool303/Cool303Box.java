/**
 * Everything is inside Box.
 * Box the most outer layer of our UI package.
 * Box creates the window that lays out all the components, such as button, container.
 * Box also take a theme as input, the theme will then be applied to everything inside the box.
 * 
 * 
 */

package JavaCool303;
import javax.swing.*;
import java.awt.*;
import java.util.*;


public class Cool303Box extends JFrame{

	// all the components inside the box
	private ArrayList<Cool303Component> components = new ArrayList<Cool303Component>();
	// supplied theme
	Cool303Theme theme;
	
	
	
	// class constructor
	
	public Cool303Box(){
		
	}
	
	
	// add a container in the box
	public void put(Cool303Component c){
		components.add(c);
	}

	// apply theme recursively to a component and its children
	private void applyTheme(Cool303Component c) {
		c.setTheme(this.theme);
		for (int i=0; i<c.getChildren().size(); i++){
			Cool303Component child = c.getChildren().get(i);
			applyTheme(child);
		}
	}
	
	// render box
	public void render(Cool303Theme theme){
		this.theme = theme;
		
		// display the window
		JFrame frame = new JFrame();
		// apply theme
		for (int i=0; i<components.size(); i++){
			Cool303Component c = components.get(i);
			applyTheme(c);
			frame.add((Component) c);
		}
		frame.setLayout(new GridLayout(1,20));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100,100);
		frame.pack();
		frame.setVisible(true);
	}
	
}
