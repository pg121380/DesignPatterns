package behavior.mediator;

import java.util.HashMap;

public class President implements Mediator {

    private HashMap<String, Department> map = new HashMap<>();

    @Override
    public void register(String name, Department department) {
        map.put(name, department);
    }

    @Override
    public void commend(String name) {
        map.get(name).selfAction();
    }
}
