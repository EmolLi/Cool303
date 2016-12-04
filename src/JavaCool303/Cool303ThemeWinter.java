package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;

public class Cool303ThemeWinter extends Cool303Theme {
	
	public Cool303ThemeWinter(){
		buttonTextColor = new Color(100,100,100);
		buttonBackground = new Color(255,255,255);
		buttonFont = new Font("Courier New", Font.ITALIC, 12);
		//FIXME: change address of icon
		buttonIcon = new ImageIcon("/home/emol/cs/Practice/Cool303/icon/icon2.png");
		buttonSelectedIcon = new ImageIcon("/home/emol/cs/Practice/Cool303/icon/icon3.png");
		buttonDimension = new Dimension(30,buttonIcon.getIconHeight());
		buttonIsToolTipText = true;
		buttonIsRollover = true;
		containerLayout = new GridLayout(4,5);

		

		
	}
}