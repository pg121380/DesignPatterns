package behavior.mediator;

public class Market implements Department {

    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("market", this);
    }

    @Override
    public void selfAction() {
        System.out.println("合作项目");
    }

    @Override
    public void outAction() {
        System.out.println("需要资金支持");
        mediator.commend("finacial");
    }
}
