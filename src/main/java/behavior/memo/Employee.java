package behavior.memo;

/**
 * 源发器类
 */
public class Employee {
    private String name;

    private int age;

    private double salary;

    //进行备忘操作
    public EmployeeMemento memento(){
        return new EmployeeMemento(this);
    }

    //进行数据恢复
    public void recovery(EmployeeMemento memento){
        this.setName(memento.getName());
        this.setAge(memento.getAge());
        this.setSalary(memento.getSalary());
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
