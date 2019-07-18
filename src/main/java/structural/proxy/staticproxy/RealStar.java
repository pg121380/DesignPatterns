package structural.proxy.staticproxy;

public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("confer");
    }

    @Override
    public void signContract() {
        System.out.println("sign");
    }

    @Override
    public void bookTicket() {
        System.out.println("book");
    }

    @Override
    public void sing() {
        System.out.println("sing");
    }

    @Override
    public void collectMoney() {
        System.out.println("collect");
    }
}
