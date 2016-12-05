/**
 * Container class
 * It extends from JPanel, and implements Cool303Component interface
 */
package JavaCool303;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.border.Border;

public class Cool303Container extends JPanel implements Cool303Component{


	private static final long serialVersionUID = 1L;
	private ArrayList<Cool303Component> components = new ArrayList<Cool303Component>();

	Image bg = null; 
	boolean bgp = false;
	
	public Cool303Container(){
		super();
	}
	public Cool303Container(boolean bgp){
		if (bgp == true){
			this.bgp = true;
		}
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if (bg != null){
			g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
		}
	}
	
	
	
	@Override
	public void setTheme(Cool303Theme theme) {
		//background panel
		if (bgp == true){
			if (theme.getContainerBackground() instanceof Color){
				this.setBackground(theme.getContainerBackground());
			}
		
			if (theme.getContainerBackgroundpic() instanceof Image){
				bg = theme.getContainerBackgroundpic();
			}
			if (theme.getBoxSize() instanceof Dimension){
				setSize(theme.getBoxSize());
			}
		}
		else {
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
		}
		setOpaque(theme.getContainerOpaque());
		// paint panel
		this.repaint();
		
	}
	
	
	// add a container in the box
	public void put(Cool303Component c){
		components.add(c);
		this.add((Component) c);
	}
	public void add(Cool303Component c, String s){
		components.add(c);
		this.add((Component) c, s);
	}
	
	@Override
	public ArrayList<Cool303Component> getChildren() {
		return components;
	}

}

