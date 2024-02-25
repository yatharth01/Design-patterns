public class App {
    public static void main(String[] args) {
        SingletonClass.getInstance().doSomething();
        DoubleCheckedLockingSingleton.getInstance().doSomething();
    }
}
