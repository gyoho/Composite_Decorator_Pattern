


public class Leaf implements Component {

    private String description ;
    private double price = 0;
    
    public Leaf ( String d ) {
        description = d ;
    }
    
    public Leaf ( String d, Double p ) {
        description = d ;
        price = p ;
    }
    
    public void printDescription() {
    	if(price == 0) {
    		System.out.print(" + " + description) ;
    	}
    	else {
            System.out.println( description + " " + price) ;
    	}
    }

    public void addChild(Component c) {
	    // no implementation
	    // Leaf is the child of Composite
	}

	public void removeChild(Component c) {
        // no implementation
        // Leaf is the child of Composite
	}

	public Component getChild(int idx) {
        // no implementation
        // Leaf is the child of Composite 
        return null ;
	}
	
	public Component getChild(String leafName) {
		return null;
	}
	
	// additional method for Decorator
	public String getDescription() {
	    return description;
	}
	
	
	public double operation(Component selection) {
		return 0;
	}
}
 
