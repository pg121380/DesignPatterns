package behavior.template;

public class DrawMoney extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("取钱");
    }
}
