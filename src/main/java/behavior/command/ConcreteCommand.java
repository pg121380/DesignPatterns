package behavior.command;

public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //命令执行前的处理
        receiver.action();
        //命令执行后的处理
    }
}
