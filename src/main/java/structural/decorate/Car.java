package structural.decorate;

/**
 * 被装饰对象
 */
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}
