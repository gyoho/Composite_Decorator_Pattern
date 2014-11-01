 

public class Burger implements PriceComponent {
    
    double basePrice = 0;
    
    public double operation(Component selection) {
    	
    	Component burgerSelection = selection.getChild("Burger");
    	
    	// volume always come at second column of burger selection
    	String volume = burgerSelection.getChild(1).getDescription();
    	
    	switch(volume) {
    	
    		case "1/3lb.":
    			basePrice = 9.50;
    			break;
    		case "1/2lb.":
    			basePrice = 12.00;
    			break;
    		case "1lb.":
    			basePrice = 18.00;
    			break;
    	}
    	
        return basePrice;
    }

}
