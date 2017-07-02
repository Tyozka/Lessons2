package Lessons14.Singleton;


public class App {
    public static void main(String[] args) {
        Connector connector =  Connector.getInstance();
        Connector connector2 =  Connector.getInstance();
        System.out.println(connector == connector2);
    }
}
