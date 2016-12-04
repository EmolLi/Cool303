package JavaCool303;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.border.Border;

public class Cool303Container extends JPanel implements Cool303Component{


	private static final long serialVersionUID = 1L;
	private ArrayList<Cool303Component> components = new ArrayList<Cool303Component>();

	@Override
	public void setTheme(Cool303Theme theme) {
		// width and height
		if (theme.getContainerSize() instanceof Dimension){
			this.setPreferredSize(theme.getContainerSize());
		}
		// layout 
		if (theme.getContainerLayout() instanceof LayoutManager){
			this.setLayout(theme.getContainerLayout());
		}
		// width and height
		if (theme.getContainerBorder() instanceof Border){
			this.setBorder(theme.getContainerBorder());
		}
		
		if (theme.getContainerBackground() instanceof Color){
			this.setBackground(theme.getContainerBackground());
		}
		
		// paint panel
		this.repaint();
		
	}
	
	
	// add a container in the box
	public void put(Cool303Component c){
		components.add(c);
		this.add((Component) c);
	}

	
	@Override
	public ArrayList<Cool303Component> getChildren() {
		return components;
	}

}

