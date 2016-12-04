/**
 * Everything in our package (except Box) is a component.
 * Each component must implement theme.
 * Each component can have children components.
 * @author Jack
 *
 */

package JavaCool303;

import java.util.*;

public interface Cool303Component {

	// force each component to set theme
	public void setTheme(Cool303Theme theme);

	// each component can have children components 
	public ArrayList<Cool303Component> getChildren();
	
}
