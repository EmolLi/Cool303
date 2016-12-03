/**
 * Everything in our package (except Box) is a component.
 * Each component must implement theme.
 * Each component can have children components.
 * @author Jack
 *
 */

package JavaCool303;


public interface Cool303Component {

	// force each component to set theme
	public void setTheme(Cool303Theme theme);

	// each component can have children components 
	public Cool303Component[] getChildren();
	
}
