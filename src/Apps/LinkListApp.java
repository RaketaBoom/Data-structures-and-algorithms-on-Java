package Apps;

import data.Employee;
import dataStructures.Lists.Link;
import dataStructures.Lists.LinkList;
import dataStructures.Lists.LinkListGeneric;

public class LinkListApp {
    public static void main(String[] args) {
        LinkListGeneric<Employee> employees = new LinkListGeneric<>();
        employees.insertFirst(new Employee(1, "John", "Intern", 19, 32000));
        employees.insertFirst(new Employee(2, "Ronald", "Junior/Java-developer", 21, 64000));
        employees.insertFirst(new Employee(3, "Mikhael", "Junior/Data-analyst", 22, 60000));
        employees.insertFirst(new Employee(4, "Garry", "middle/Java-developer", 24, 108000));
        employees.insertFirst(new Employee(5, "David", "middle/Data-scientist ", 26, 120000));
        employees.insertFirst(new Employee(6, "Nail", "Senior/Java-developer", 24, 172000));

        employees.displayList();


        while( !employees.isEmpty())
        {
            System.out.print("Deleted: ");
            System.out.println(employees.deleteFirst());
        }

        employees.displayList();


        LinkList theList = new LinkList();
        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.displayList();

        Link f = theList.find(44);
        if( f!= null)
            System.out.println("Found link with key " + f.iData);
        else
            System.out.println("Can't find link");

        Link d = theList.delete(66);
        if (d != null)
            System.out.println("Deleted link with key " + d.iData);
        else
            System.out.println("Can't find link");

        theList.displayList();
    }
}
