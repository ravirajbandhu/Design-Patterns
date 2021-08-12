public class Singleton {
    
    private static Singleton instance; 

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            System.out.println("Creating new instance");
            instance = new Singleton();
            return instance;
        } else {
            System.out.println("Returning old instance");
            return instance;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s = Singleton.getInstance();
    }
}