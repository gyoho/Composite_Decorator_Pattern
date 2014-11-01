public class BuildOrder {

    public static Component getOrder() {
        
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));


        Composite customBurger = new Composite( "Build Your Own Burger" );
        
        Composite burgerSelection = new Composite("Burger");
        burgerSelection.addChild(new Leaf("Beef"));
        burgerSelection.addChild(new Leaf("1/3lb."));
        burgerSelection.addChild(new Leaf("on a Bun"));
	
    	Composite cheeseSelection = new Composite("Cheese");
    	cheeseSelection.addChild(new Leaf( "Danish Blue Cheese" ));
    	cheeseSelection.addChild(new Leaf("Horseradish Cheddar"));
    	
    
    	Composite toppingSelection = new Composite("Topping");      
    	toppingSelection.addChild(new Leaf("Bermuda Red Onion"));
    	toppingSelection.addChild(new Leaf("Black Olives"));
    	toppingSelection.addChild(new Leaf("Carrot Strings"));
    	toppingSelection.addChild(new Leaf("Coleslaw"));
    
    	Composite premiumSelection = new Composite("Premium"); 
    	premiumSelection.addChild(new Leaf("Applewood Smoked Bacon"));
    
    	Composite sauceSelection = new Composite("Sauce"); 
    	sauceSelection.addChild(new Leaf("Apricot Sauce"));
    
    
    	customBurger.addChild(burgerSelection);
    	customBurger.addChild(cheeseSelection);
    	customBurger.addChild(toppingSelection);
    	customBurger.addChild(premiumSelection);
    	customBurger.addChild(sauceSelection);

        order.addChild( customBurger );
        
        
        return order ;       
    }

}