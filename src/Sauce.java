 

public class Sauce extends Decorator {

    private double addedPrice;

    public Sauce( Component c) {
        super( c ) ;
    }

    public double operation(Component selection) {
        addedPrice = super.operation(selection) ;
        return setOptions( addedPrice, selection ) ;
    }

    private double setOptions(double in, Component selection) {
    	
    	Component sauceSelection = selection.getChild("Sauce");
        
    	if(((Composite) sauceSelection).getChildSize() > 1) {
            return ( in + 1.00*(((Composite) sauceSelection).getChildSize() - 1));
        }
        else {
            return in;
        }
    }

}
