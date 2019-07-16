package creational.singleton;

/**
 * 由于编译器优化(指令重排)和jvm内存模型的原因 可能会出现问题 不建议使用
 */
public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton singleton;

    private DoubleCheckedLockingSingleton(){}

    public static DoubleCheckedLockingSingleton getInstance(){
        if(singleton != null){
            return singleton;
        }
        synchronized (DoubleCheckedLockingSingleton.class){
            if (singleton == null){
                singleton = new DoubleCheckedLockingSingleton();
            }
        }
        return singleton;
    }

}
