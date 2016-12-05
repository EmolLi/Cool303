/**
 * Theme Winter
 * It provides winter style buttons and containers, and windows
 */
package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;

public class Cool303ThemeWinter extends Cool303Theme {
	
	public Cool303ThemeWinter(){
		//button attributes
		buttonTextColor = new Color(100,100,100);
		buttonBackground = new Color(255,255,255);
		buttonFont = new Font("Courier New", Font.ITALIC, 12);
		//FIXME: change address of icon
		buttonIcon = new ImageIcon("././icon/icon2.png");
		buttonSelectedIcon = new ImageIcon("././icon/icon3.png");
		buttonDimension = new Dimension(50,buttonIcon.getIconHeight());
		buttonIsToolTipText = true;
		buttonIsRollover = true;
		buttonIsIconShape = true;
		
		//container attributes
		containerLayout = new GridLayout(4,5);
		containerBackground = new Color(200,100,100);
		containerSize = new Dimension(500,300);
		containerBackgroundpic = new ImageIcon("././icon/wbg.png");
		
		//box attributes
		boxSize = new Dimension(500,400);
		

		
	}
}