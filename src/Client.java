 

public class Client {

    public static void runTest() {
        Component theOrder = BuildOrder.getOrder() ;

        Component customBurger = theOrder.getChild("Build Your Own Burger");
        Component customBurgerPrice = new Sauce( new Premium( new Topping( new Cheese( new Burger() ) ) ) ); 
        double result = customBurgerPrice.operation(customBurger) ;
        
        
        theOrder.printDescription();
        System.out.println("\n\nTotal Custom Burger Price: " + result);
    }
}
 
