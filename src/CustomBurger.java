

public class CustomBurger extends Composite {
    
    PriceDecorator customBurgerPrice = new Sauce( new Premium( new Topping( new Cheese( new Burger() ) ) ) ); 
    
    public CustomBurger ( String d ) {
        super(d);
    }
    
    // Override
    public void printDescription() {
        double result = customBurgerPrice.operation(this) ;
    	
        System.out.println("\n" + description + ": " + result);
        for(Component obj  : components) {
            obj.printDescription();
        }
    }
}
