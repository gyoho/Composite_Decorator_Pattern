 

public class Cheese extends PriceDecorator {

    private double addedPrice;

    public Cheese( PriceComponent c) {
        super( c ) ;
    }

    public double operation(CustomBurger selection) {
    	addedPrice = super.operation(selection) ;
        return setOptions( addedPrice, selection ) ;
    }

    private double setOptions(double in, CustomBurger selection) {
    	
    	Component cheeseSelection = selection.getChild("Cheese");
        
    	if(((Composite) cheeseSelection).getChildSize() > 1) {
            return ( in + 1.00*(((Composite) cheeseSelection).getChildSize() - 1));
        }
        else {
            return in;
        }
    }

}
