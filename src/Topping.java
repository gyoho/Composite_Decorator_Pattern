 

public class Topping extends Decorator {

    private double addedPrice;

    public Topping( Component c) {
        super( c ) ;
    }

    public double operation(Component selection) {
    	addedPrice = super.operation(selection) ;
        return setOptions( addedPrice, selection ) ;
    }

    private double setOptions(double in, Component selection) {
    	
    	Component toppingSelection = selection.getChild("Topping");
    	
        if(((Composite) toppingSelection).getChildSize() > 4) {
            return ( in + 0.75*(((Composite) toppingSelection).getChildSize() - 4));
        }
        else {
            return in;
        }
    }

}
