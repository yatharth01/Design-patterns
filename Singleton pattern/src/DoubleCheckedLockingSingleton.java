public class DoubleCheckedLockingSingleton {

    /*
     *  once an object is created synchronization is no longer useful because now obj will not be null
     *  and any sequence of operations will lead to consistent results.
     *  So we will only acquire the lock on the getInstance() once when the obj is null.
     *  This way we only synchronize the first way through, just what we want. 
     */

    private static DoubleCheckedLockingSingleton obj = null;

    private DoubleCheckedLockingSingleton(){
        System.out.println("DoubleCheckedLockingSingleton instantiated");
    }

    public static DoubleCheckedLockingSingleton getInstance(){
        if(obj == null){

            //make thread safe
            synchronized(DoubleCheckedLockingSingleton.class){
                // check again as multiple threads
                // can reach above step
                if(obj == null){
                    obj = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return obj;
    }

    public void doSomething(){
        System.out.println("Do something in dobleCheckedLockingSingleton class");
    }
}
