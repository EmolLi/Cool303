import JavaCool303.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

 	public static void main(String[] args) {
		
 		Cool303Box box = new Cool303Box();
 		Cool303Theme theme = new Cool303ThemePastel();
 		box.render(theme);
 		System.out.println(null instanceof Dimension);
	}

}
