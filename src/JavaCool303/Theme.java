package JavaCool303;

import java.awt.*;

import javax.swing.ImageIcon;

public abstract class Theme {
	

	
	
	
	protected Color buttonTextColor;
	protected Color buttonBackground;
//	private int buttonFontSize;
	protected Dimension buttonDimension;
	protected Font buttonFont;
	protected ImageIcon buttonIcon;

	

//	private int titleFontSize;
	
	public Color getButtonTextColor(){
		return buttonTextColor;
	}
	public Color getButtonBackground(){
		return buttonBackground;
	}
/**
	public int getButtonFontSize(){
		return buttonFontSize;
	}**/
	public Dimension getDimension(){
		return buttonDimension;
	}
	
	public ImageIcon getButtonIcon(){
		return buttonIcon;
	}

	/**
	public int getTitleFontSize(){
		return titleFontSize;
	}**/
}
