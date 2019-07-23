package behavior.memo;

public class Client {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Employee employee = new Employee("张三", 18, 12345.46);
        System.out.println("第一次创建对象:" + employee);

        careTaker.setMemento(employee.memento());   //进行备份
        employee.setName("李四");
        employee.setAge(25);
        System.out.println("修改后的对象:" + employee);

        employee.recovery(careTaker.getMemento());      //恢复

        System.out.println("恢复后的对象:" + employee);

    }
}
