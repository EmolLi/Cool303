package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;

public class Cool303ThemePastel extends Cool303Theme {
	
	public Cool303ThemePastel(){
		buttonTextColor = new Color(100,100,100);
		buttonBackground = new Color(100,200,200);
//		private int buttonFontSize;
		buttonDimension = new Dimension(20,10); 
		buttonFont = new Font("Courier New", Font.ITALIC, 12);
		buttonIcon = null;
		
		containerLayout = new GridLayout(4,5);

		

		
	}
}