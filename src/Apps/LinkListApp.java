package Apps;

import data.Employee;
import dataStructures.Lists.LinkList;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList<Employee> employees = new LinkList<>();
        employees.insertFirst(new Employee("John", "Intern", 19, 32000));
        employees.insertFirst(new Employee("Ronald", "Junior/Java-developer", 21, 64000));
        employees.insertFirst(new Employee("Mikhael", "Junior/Data-analyst", 22, 60000));
        employees.insertFirst(new Employee("Garry", "middle/Java-developer", 24, 108000));
        employees.insertFirst(new Employee("David", "middle/Data-scientist ", 26, 120000));
        employees.insertFirst(new Employee("Nail", "Senior/Java-developer", 24, 172000));

        employees.displayList();


        while( !employees.isEmpty())
        {
            System.out.print("Deleted: ");
            System.out.println(employees.deleteFirst());
        }

        employees.displayList();
    }
}
