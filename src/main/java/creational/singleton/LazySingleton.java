package creational.singleton;

/**
 * 懒汉式:资源利用率高，但是synchronized导致了并发效率低
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }

}
