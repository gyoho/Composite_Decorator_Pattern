 

public class PriceDecorator implements PriceComponent {

	private PriceComponent component;
	
    public PriceDecorator(PriceComponent options ) {
        component = options ;
    }

	public double operation(Component selection) {
        return component.operation(selection) ;
    }

}
