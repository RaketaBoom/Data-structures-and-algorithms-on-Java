package data;

public class Employee {
    private String name;
    private String position;
    private int age;
    private float salary;

    public Employee(String name, String position, int age, float salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
