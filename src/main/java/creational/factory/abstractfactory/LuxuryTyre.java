package creational.factory.abstractfactory;

public class LuxuryTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("转得快");
    }
}
