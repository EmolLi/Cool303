/**
 * Theme Pastel
 * It provides pastel style buttons and containers, and windows
 */
package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;

public class Cool303ThemePastel extends Cool303Theme {
	
	public Cool303ThemePastel(){
		buttonTextColor = new Color(100,100,100);
		buttonBackground = new Color(255,255,255);
		buttonFont = new Font("Courier New", Font.ITALIC, 12);
		buttonIcon = new ImageIcon("././icon/icon5.png");
		buttonSelectedIcon = new ImageIcon("././icon/iconPS.png");
		buttonDimension = new Dimension(buttonIcon.getIconWidth(),buttonIcon.getIconHeight());
		buttonIsToolTipText = true;
		buttonIsIconShape = true;
		buttonIsRollover = true;
		buttonRollOverIcon = new ImageIcon("././icon/iconPH.png");
		
		//containerLayout = new GridLayout(5,4);
		containerBackgroundpic = new ImageIcon("././icon/bb.png");
		containerSize = new Dimension(200,150);
		containerOpaque = false;
		//containerPosistion 
		
		boxSize = new Dimension(500,400);
		boxIsUndecorated = true;
		
		
	}
}