package structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {

    private Star readStar;

    public StarHandler(Star readStar) {
        this.readStar = readStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在这里做统一的流程控制
        method.invoke(readStar,args);
        //在这里做统一的流程控制
        return null;
    }
}
