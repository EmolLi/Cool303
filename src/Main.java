import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import JavaCool303.*;
/**
 * A demo that displays window, box and 20 buttons
 * @author emol
 *
 */

public class Main {

 	public static void main(String[] args) {
		
 		// create box
 		Cool303Box box = new Cool303Box();
 		Cool303Container container = new Cool303Container();
 		//background pane
 		Cool303Container bgcontainer = new Cool303Container(true);
 		bgcontainer.setLayout(null);
 		// put all components on our box
		for (int i=0; i<20; i++){
			container.put(new Cool303Button(i));
		}
		bgcontainer.add((Cool303Component)container, BorderLayout.CENTER);
		box.put(bgcontainer);
		
		
		//========= render box with theme =================
		// change Cool303ThemePastel() to Cool303ThemeWinter() to see winter theme
 		box.render(new Cool303ThemePastel());
 		
 		//set position and layout
 		container.setLayout(new GridLayout(5,4));
 		Insets insets = bgcontainer.getInsets();
 		container.setBounds(250+insets.left, 150+insets.top, 250, 200);
 		Insets binsets = box.getInsets();
 		box.setSize(binsets.left+binsets.right+750, binsets.bottom+binsets.top+550);
 		box.setVisible(true);
	}

}
