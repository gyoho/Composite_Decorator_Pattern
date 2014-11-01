 

public class Premium extends PriceDecorator {

    private double addedPrice;

    public Premium( PriceComponent c) {
        super( c ) ;
    }

    public double operation(CustomBurger selection) {
    	addedPrice = super.operation(selection) ;
        return setOptions( addedPrice, selection ) ;
    }

    private double setOptions(double in, CustomBurger selection) {
    	
    	Component premiumSelection = selection.getChild("Premium");
    	
        return ( in + 1.50* ( ((Composite)premiumSelection).getChildSize() ) );
    }

}
