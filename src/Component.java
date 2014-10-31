 

public interface Component {
    void printDescription() ;
    void addChild(Component c);
    void removeChild(Component c);
    String getDescription();
    Component getChild(int idx);
    Component getChild(String leafName);
	double operation(Component selection);
}
