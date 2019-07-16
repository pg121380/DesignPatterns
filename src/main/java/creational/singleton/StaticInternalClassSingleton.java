package creational.singleton;

/**
 * 静态内部类：兼具了并发效率和资源利用率(懒加载)
 */
public class StaticInternalClassSingleton {

    private static class SingletonInstance{
        private static final StaticInternalClassSingleton SINGLETON = new StaticInternalClassSingleton();
    }

    private StaticInternalClassSingleton(){}

    public static StaticInternalClassSingleton getInstance(){
        return SingletonInstance.SINGLETON;
    }

}
