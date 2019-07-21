package behavior.command;

/**
 * 命令的发起者
 */
public class Invoke {

    private Command command;    //可以用容器包含多条命令

    public Invoke(Command command) {
        this.command = command;
    }

    public void call(){
        //命令调用前的操作
        command.execute();
        //命令执行后的操作
    }


}
