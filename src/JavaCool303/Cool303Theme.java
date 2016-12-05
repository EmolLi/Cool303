/**
 * Cool303Theme abstract class.
 * User can extends this class to implement his own theme easily
 */
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
	protected ImageIcon buttonImage;
	protected ImageIcon buttonSelectedImage;
	protected ImageIcon buttonHoveroverImage;
	protected ImageIcon buttonIcon;
	protected ImageIcon buttonSelectedIcon;
	protected ImageIcon buttonRollOverIcon;
	protected Border buttonBorder;
	protected boolean buttonIsToolTipText;
	protected boolean buttonOpaque;
	protected boolean buttonIsRollover;
	protected boolean buttonIsIconShape;
	

	//container attributes
	protected LayoutManager containerLayout;
	protected Dimension containerSize;
	protected Border containerBorder;
	protected Color containerBackground;
	protected ImageIcon containerBackgroundpic;
	protected boolean containerOpaque;
	
	//box attributes
	protected Shape boxShape;
	protected Dimension boxSize;
	protected boolean boxIsUndecorated;
	
	//box get methods
	public Dimension getBoxSize(){
		return boxSize;
	}
	public boolean getBoxIsUndecorated(){
		return boxIsUndecorated;
	}
	
	
	//container get methods
	public Image getContainerBackgroundpic(){
		return containerBackgroundpic.getImage();
	}
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
	public boolean getContainerOpaque(){
		return containerOpaque;
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
	public ImageIcon buttonImage(){
		return buttonImage;
	}
	public ImageIcon buttonSelectedImage(){
		return buttonSelectedImage;
	}
	public ImageIcon buttonHoveroverImage(){
		return buttonHoveroverImage;
	}
	public ImageIcon getButtonIcon(){
		return buttonIcon;
	}
	public ImageIcon getButtonSelectedIcon(){
		return buttonSelectedIcon;
	}
	public ImageIcon getButtonRollOverIcon(){
		return buttonRollOverIcon;
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
	public boolean getButtonIsIconShape(){
		return buttonIsIconShape;
	}
}