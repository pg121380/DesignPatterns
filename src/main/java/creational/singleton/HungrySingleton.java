package creational.singleton;

/**
 * 饿汉式：线程安全，调用效率高。不能延迟加载
 * @author Liyifan
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){
        if (singleton != null){
            throw new RuntimeException("这是一个单例类，不要试图创建多个对象！");
        }
    }

    public static HungrySingleton getInstance(){
        return singleton;
    }

}
