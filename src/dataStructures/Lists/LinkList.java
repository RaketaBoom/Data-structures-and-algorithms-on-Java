package dataStructures.Lists;



public class LinkList <T>
{
    private Link<T> first;
    //------------------------------
    public void LinkList()
    {
        first = null;
    }
    //------------------------------
    public boolean isEmpty()
    {
        return (first==null);
    }
    //------------------------------
    public void insertFirst(T d)
    {
        Link<T> newLink = new Link(d);
        newLink.next = first;
        first = newLink;
    }
    //------------------------------
    public T deleteFirst()
    {
        T temp = first.data;
        first = first.next;
        return temp;
    }
    //------------------------------
    public void displayList()
    {
        System.out.print("List (first --> last): ");;
        Link<T> current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
    //------------------------------
    //------------------------------
}
