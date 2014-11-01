 

import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    
    public Composite ( String d ) {
        description = d ;
    }

	public void printDescription() {
        System.out.println("\n" + description + ":");
        for(Component obj  : components) {
            obj.printDescription();
        }
    }

	public void addChild(Component c) {
        components.add(c) ;
	}
	 
	public void removeChild(Component c) {
        components.remove(c) ;
	}
	 
	public Component getChild(int idx) {
	    return components.get(idx) ;
	}
	
	// additional method for Decorator
	public Component getChild(String leafName) {
	    for(Component child : components) {
	        if((child).getDescription().equals(leafName)) {
	            return child;
	        }
	    }
	    return null;
	}
	
	// additional method for Decorator
	public int getChildSize() {
		return components.size();
	}
	
	// additional method for Decorator Burger
	public String getDescription() {
		return description;
	}
	
}
 
