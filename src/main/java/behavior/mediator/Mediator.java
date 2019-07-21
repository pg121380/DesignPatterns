package behavior.mediator;

/**
 * 中介
 */
public interface Mediator {
    void register(String name,Department department);

    void commend(String name);
}
