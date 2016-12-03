package JavaCool303;

import java.awt.*;

import javax.swing.ImageIcon;

public abstract class Cool303Theme {
	

	
	
	
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