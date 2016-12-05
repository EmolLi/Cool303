# Cool303
  Author: Jack (Shu Chen) Zhang, Duan(Emol) Li
  
  
  JavaCool303 is a library of classes that implements pretty GUI on top of Java Swing.
  
  It's based on themes. You have to provide a Cool303Theme that modifies the look of the GUI. This package comes with Two themes: Pastel and Winter.
  
  Check out the demo on how to apply theme.
  
  For JavaCool303 Classes and methods, check out doc for detailed explaination.
  
  
  
  
  **SUPER EASY TO CUSTOMIZE YOUR OWN THEME**
  
  The main advantage of JavaCool303 is it's super easy for developer to create their own themes.
  We provides an abstract class Cool303Theme that already implements all the functions you need. 
  All you need to do is change a few attributes in the constructor in your customized theme class.
  Styling in JavaCool303 is like css!
  
  
  
  **STRATEGY PATTERN**
  
  We used strategy pattern in styling the GUI. To style the GUI, you have a bunch of themes to choose from!
  You pass one theme to the topmost container JavaCool303Box, and Box will handles all the rest work.
  Box applies the theme to every JavaCool303Components it has, and these JavaCool303Components will in turn apply themes to their children and etc.
  Basically, JavaCool303Components are responsible for stylying itself. It goes over all the attribute values related to it in theme, and apply them.
  Even though this means a lot of getMethods and check theme attributes statements in JavaCool303Theme class and components classes, these are only written once.
  In the future, when a developer wants to write a new theme, he doesn't have to write even a single method. 
  
  We have considered using decorator pattern. However, with decorator pattern, theme is responsible for styling, so user have to implement their own methods to write a new theme. He may need to read over Swing docs to figure how to override paint() so he could change the shape of a component. But in our way, he just need to set the backgroundPic to a picture, then automatically the button has the shape with the picture. It works best with png image, as it's good for image with transparent part, so we have various shapes of components! Checkout Cool303ThemePastel for customized shape window.
  
  
  
  **Other well-formed techniques**
  
  **abstract class & inheritance**: Cool303Theme
  
  All customized theme extends this class, and gets all the methods needed to style the GUI. 
  This highly increases code reuse in the long run. 
  And it formats what the developer could do, so it's programming by contract.
  
  
  **protected**:
  
  All attributes in Cool303Theme are defined protected. In this way, it's easy for programmer to write his own theme, he could change the theme attributes freely. No need for setter methods. But other objects cannot change the theme attributes.
  
  
  **interface**: Cool303Component
  
  All the classes in Cool303 package (except themes) implements this interface. They are all Cool303Components, this makes sure they all implements getChildren and setTheme methods. (programming by contract)
  
  
  **inheritance**:
  
  Cool303 classes are based on Java Swing. Cool303Box extends JFrame, Cool303Container extends JPanel, Cool303Button extends JButton. So they got all the methods of the parent classes.
  
  They also overrides some parent' methods to provide richer functionality. For example, JContainer overrides paintComponent, so it has customized shape.
  
  
  
  
  
  
  
  
