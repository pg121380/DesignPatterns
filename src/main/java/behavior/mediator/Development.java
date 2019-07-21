package behavior.mediator;

public class Development implements Department {

    private Mediator mediator;  //持有中介者d额引用

    public Development(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心研发");
    }

    @Override
    public void outAction() {
        System.out.println("没钱了！需要资金支持");
        mediator.commend("finacial");
    }
}
