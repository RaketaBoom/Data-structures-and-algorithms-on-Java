package data;

public class Employee implements Id_key{
    private int id;
    private String name;
    private String position;
    private int age;
    private float salary;

    public Employee(int id, String name, String position, int age, float salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int getId(){
        return id;
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
