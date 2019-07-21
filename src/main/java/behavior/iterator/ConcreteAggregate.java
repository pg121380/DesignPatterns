package behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate {
    private List<Object> list = new ArrayList<>();

    public ConcreteAggregate(List<Object> list) {
        this.list = list;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public void add(Object o){
        list.add(o);
    }

    public void remove(Object o){
        list.remove(o);
    }

    private class ConcreteMyIrerator implements MyIterator{

        private int cusor;  //游标，用于记录遍历时的位置

        @Override
        public void first() {
            cusor = 0;
        }

        @Override
        public void next() {
            if(cusor < list.size()){
                cusor++;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        @Override
        public boolean hasNext() {
            if(cusor < list.size()){
                return true;
            } else {
                return false;
            }
        }

        @Override
        public boolean isFirst() {
            return cusor == 0;
        }

        @Override
        public boolean isLast() {
            return cusor == list.size() - 1;
        }

        @Override
        public Object getCurrectObj() {
            return list.get(cusor);
        }
    }

    public MyIterator iterator(){
        return new ConcreteMyIrerator();
    }
}
