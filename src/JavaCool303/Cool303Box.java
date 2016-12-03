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


public class Cool303Box extends JFrame{

	// all the components inside the box
	Cool303Component[] components;
	// supplied theme
	Cool303Theme theme;
	
	
	
	// class constructor
	public Cool303Box(){
		
	}
	
	
	// add a container in the box
	public void addContainer(Cool303Container container){
		
	}

	// apply theme recursively to a component and its children
	private void applyTheme(Cool303Component c) {
		c.setTheme(theme);
		for (int i=0; i<c.getChildren().length; i++){
			Cool303Component child = c.getChildren()[i];
			applyTheme(child);
		}
	}
	
	// render box
	public void render(Cool303Theme theme){
		// apply theme
		for (int i=0; i<components.length; i++){
			applyTheme(components[i]);
		}
		// create our box
		JPanel box = new JPanel();
		box.setLayout(new GridLayout(1,20)); 
		// put all components on our box
		for (int i=0; i<100; i++){
			box.add((Component) components[i]);
		}
		// display the window
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new JScrollPane(box), BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
	
}
