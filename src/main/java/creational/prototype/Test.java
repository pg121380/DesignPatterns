package creational.prototype;

import java.util.Date;

/**
 * 测试原型模式
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep1 = new Sheep("少莉", new Date(1234564554L));
        System.out.println(sheep1);

        Sheep sheep2 = (Sheep) sheep1.clone();
        System.out.println(sheep2);
    }
}