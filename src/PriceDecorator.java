 

public class PriceDecorator implements PriceComponent {

	private PriceComponent component;
	
    public PriceDecorator(PriceComponent options ) {
        component = options ;
    }

    // Use Component as parameter type instead CustomBurger
	public double operation(Component selection) {
        return component.operation(selection) ;
    }

}
