import JavaCool303.*;


public class Main {

 	public static void main(String[] args) {
		
 		// create box
 		Cool303Box box = new Cool303Box();
 		Cool303Container container = new Cool303Container();
		// put all components on our box
		for (int i=0; i<20; i++){
			container.put(new Cool303Button(i));
		}
		box.put(container);
		// render box with theme
 		box.render(new Cool303ThemeWinter());
	}

}
