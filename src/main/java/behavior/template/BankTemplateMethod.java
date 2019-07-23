package behavior.template;

public abstract class BankTemplateMethod {
    public void takeNumber(){
        System.out.println("取号排队");
    }

    public abstract void transact();    //

    public void evaluate(){
        System.out.println("反馈");
    }

    public final void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
