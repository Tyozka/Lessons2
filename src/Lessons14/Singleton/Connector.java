package Lessons14.Singleton;

public class Connector {
    private static Connector connector;
   // eager реализация как только так сразу
   // lazy реализация (когда уже никак)
    public static Connector getInstance(){
        connector = connector == null ? new Connector() : connector;
        return connector;

    }
    {
        System.out.println("10 connect is created");
    }

    private Connector(){

    }

    public void connect(){
        System.out.println("Connectid");
    }
}
