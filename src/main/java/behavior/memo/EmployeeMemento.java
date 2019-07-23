package behavior.memo;

/**
 * 备忘录类
 */
public class EmployeeMemento {
    private String name;

    private int age;

    private double salary;

    public EmployeeMemento(Employee employee) {
        this.setName(employee.getName());
        this.setAge(employee.getAge());
        this.setSalary(employee.getSalary());
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
}
