package JavaCool303;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.border.Border;

public abstract class Cool303Theme {
	

	
	
	
	protected Color buttonTextColor;
	protected Color buttonBackground;
//	private int buttonFontSize;
	protected Dimension buttonDimension;
	protected Font buttonFont;
	protected ImageIcon buttonIcon;

	protected LayoutManager containerLayout;
	protected Dimension containerSize;
	protected Border containerBorder;
	protected Color containerBackground;
	
	
	
	public LayoutManager getContainerLayout(){
		return containerLayout;
	}
	
	public Dimension getContainerSize(){
		return containerSize;
	}
	
	public Border getContainerBorder(){
		return containerBorder;
	}
	
	public Color getContainerBackground(){
		return containerBackground;
	}
	
	public Color getButtonTextColor(){
		return buttonTextColor;
	}
	public Color getButtonBackground(){
		return buttonBackground;
	}

	public Dimension getButtonDimension(){
		return buttonDimension;
	}
	
	public Font getButtonFont(){
		return buttonFont;
	}
	
	public ImageIcon getButtonIcon(){
		return buttonIcon;
	}
	
	

}