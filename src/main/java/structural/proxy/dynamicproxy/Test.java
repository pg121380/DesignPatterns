package structural.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Star readStar = new RealStar();
        StarHandler handler = new StarHandler(readStar);
        Star proxy =(Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
        proxy.sing();
    }
}
