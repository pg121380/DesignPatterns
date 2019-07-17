package creational.factory.abstractfactory;

public class LuxuryEngine implements Engine {
    @Override
    public void run() {
        System.out.println("转速快");
    }

    @Override
    public void start() {
        System.out.println("启动快");
    }
}
