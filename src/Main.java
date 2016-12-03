import JavaCool303.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

 	public static void main(String[] args) {
		
 		// create box
 		Cool303Box box = new Cool303Box();
		// put all components on our box
		for (int i=0; i<20; i++){
			box.put(new Cool303Button(i));
		}
		// render box with theme
 		box.render(new Cool303ThemePastel());
	}

}
