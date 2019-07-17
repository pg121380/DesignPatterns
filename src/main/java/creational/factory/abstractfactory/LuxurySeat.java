package creational.factory.abstractfactory;

public class LuxurySeat implements Seat {
    @Override
    public void message() {
        System.out.println("可以自动按摩");
    }
}
