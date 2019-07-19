package structural.composite;

public interface Composite extends Component {
    void add(Component component);

    void remove(Component component);

    Component getChild(int index);
}
