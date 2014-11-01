

public class CustomBurger extends Composite {
    
    public CustomBurger ( String d ) {
        super(d);
    }
    
    // Override
    public void printDescription() {
    	
    	PriceComponent customBurgerPrice = new Sauce( new Premium( new Topping( new Cheese( new Burger() ) ) ) ); 
        double result = customBurgerPrice.operation(this) ;
    	
        System.out.print("\n" + description + ": " + result);
        for(Component obj  : components) {
            obj.printDescription();
        }
    }
}
