package behavior.mediator;

public class Finacial implements Department {

    private Mediator mediator;  //持有中介者d额引用

    public Finacial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("finacial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("数钱");
    }

    @Override
    public void outAction() {
        System.out.println("钱太多了，花钱");
    }
}
