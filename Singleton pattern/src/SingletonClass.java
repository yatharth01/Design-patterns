public class SingletonClass {

    private static SingletonClass singletonInstance;

    // Private constructor
    private SingletonClass(){
        System.out.println("Singleton is instantiated");
    }
    
    public static SingletonClass getInstance(){
        if(singletonInstance == null){
            singletonInstance = new SingletonClass();
        }
        return singletonInstance;
    }

    public void doSomething(){
        System.out.println("Do something");
    }
}
