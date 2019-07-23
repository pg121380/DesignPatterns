package behavior.memo;

/**
 * 负责人类 负责管理备忘录对象
 */
public class CareTaker {
    private EmployeeMemento memento;

    public EmployeeMemento getMemento() {
        return memento;
    }

    public void setMemento(EmployeeMemento memento) {
        this.memento = memento;
    }
}
