package creational.factory.abstractfactory;

public class LowerSeat implements Seat {
    @Override
    public void message() {
        System.out.println("不能自动按摩");
    }
}
