 

public interface Component {
    void printDescription() ;
    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int idx);
    Component getChild(String leafName);
    String getDescription();
    double operation(Component selection);
}
