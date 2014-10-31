 

public class Decorator implements Component {

	private Component component;

    public Decorator( Component options ) {
        component = options ;
    }

	public double operation(Component selection) {
        return component.operation(selection) ;
    }
    
    public void printDescription() {
    }
    
    public void addChild(Component c) {
    }
    
    public void removeChild(Component c) {
    }
    
    public Component getChild(int idx) {
        return null;
    }

	public Component getChild(String leafName) {
		return null;
	}

	public String getDescription() {
		return null;
	}
}
