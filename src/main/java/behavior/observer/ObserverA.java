package behavior.observer;

public class ObserverA implements Observer {

    private int myState;

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }
}
