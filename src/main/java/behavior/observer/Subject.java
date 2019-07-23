package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void register(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知所有的观察者更新状态
     */
    public void notifyAllObservers(){
        for (Observer o: observers) {
            o.update(this);
        }
    }
}
