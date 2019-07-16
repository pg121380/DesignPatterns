package creational.singleton;

/**
 * 通过枚举实现单例模式，避免了使用反射和反序列化漏洞，不能延时加载
 */
public enum EnumSingleton {
    //这个枚举元素本身就是单例
    INSTANCE;

    public void singletonOperation(){
        //可以在其中添加操作
    }
}
