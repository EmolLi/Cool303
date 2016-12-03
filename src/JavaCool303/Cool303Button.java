/**
 * Button class.
 * It extends from swing's JButton.
 * And it's a component.
 * @author Jack
 *
 */


package JavaCool303;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cool303Button extends JButton implements Cool303Component {

	// each button has a label
	int label;
	
	/**
	 * Construct a button.
	 * Button must have a label.
	 * When clicked, it prints the label on console.
	 */
	public Cool303Button(int label){
		super(String.valueOf(label));
		// give button a label
		this.label = label;
		// on click, print button label on console
		this.addActionListener(new ActionListener(){
 	   		@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(label);
			}
 	   });
	}
	
	// set button theme
	@Override
	public void setTheme(Cool303Theme theme) {
		// background color
		if (theme.getButtonBackground() instanceof Color){
			this.setBackground(theme.getButtonBackground());
		}
		// text color
		if (theme.getButtonTextColor() instanceof Color){
			this.setForeground(theme.getButtonTextColor());
		}
		// width and height
		if (theme.getButtonDimension() instanceof Dimension){
			this.setPreferredSize(theme.getButtonDimension());
		}
		// font family, style, and size
		if (theme.getButtonFont() instanceof Font){
			this.setFont(theme.getButtonFont());
		}
		// paint button
		this.repaint();
	}

	// by default, a component can have children
	// a button doesn't have any children
	@Override
	public Cool303Component[] getChildren() {
		Cool303Component[] children = {};
		return children;
	}
	
	
}
