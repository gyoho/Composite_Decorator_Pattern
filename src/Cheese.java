 

public class Cheese extends Decorator {

    private double addedPrice;

    public Cheese( Component c) {
        super( c ) ;
    }

    public double operation(Component selection) {
    	addedPrice = super.operation(selection) ;
        return setOptions( addedPrice, selection ) ;
    }

    private double setOptions(double in, Component selection) {
    	
    	Component cheeseSelection = selection.getChild("Cheese");
        
    	if(((Composite) cheeseSelection).getChildSize() > 1) {
            return ( in + 1.00*(((Composite) cheeseSelection).getChildSize() - 1));
        }
        else {
            return in;
        }
    }

}
