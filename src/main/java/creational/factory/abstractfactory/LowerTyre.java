package creational.factory.abstractfactory;

public class LowerTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("转得慢");
    }
}
