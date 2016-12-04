package JavaCool303;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.border.Border;

public abstract class Cool303Theme {
	
	//button attributes
	protected Color buttonTextColor;
	protected Color buttonBackground;
	protected Dimension buttonDimension;
	protected Font buttonFont;
	protected ImageIcon buttonIcon;
	protected ImageIcon buttonSelectedIcon;
	protected Border buttonBorder;
	protected boolean buttonIsToolTipText;
	protected boolean buttonOpaque;
	protected boolean buttonIsRollover;


	//container attributes
	protected LayoutManager containerLayout;
	protected Dimension containerSize;
	protected Border containerBorder;
	protected Color containerBackground;
	
	
	//container get methods
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
	
	
	//button get methods
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
	public ImageIcon getButtonSelectedIcon(){
		return buttonSelectedIcon;
	}
	public Border getButtonBorder(){
		return buttonBorder;
	}
	public boolean getButtonToolTipText(){
		return buttonIsToolTipText;
	}
	public boolean getButtonOpaque(){
		return buttonOpaque;
	}
	public boolean getButtonIsRollover(){
		return buttonIsRollover;
	}
}