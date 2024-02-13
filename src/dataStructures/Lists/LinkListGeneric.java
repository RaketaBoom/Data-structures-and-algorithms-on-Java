package dataStructures.Lists;


import data.Id_key;

public class LinkListGeneric<T extends Id_key>
{
    private LinkPP<T> first;
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
        LinkPP<T> newLinkPP = new LinkPP(d);
        newLinkPP.next = first;
        first = newLinkPP;
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
        LinkPP<T> current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
    //------------------------------
    public T find (int id)
    {
        LinkPP<T> current = first;
        while (current.data.getId() != id)
        {
            if (current.next == null)
                return null;
            else
                current = current.next;
        }
        return current.data;
    }

    public T delete (int id)
    {
        LinkPP<T> curr = first;
        LinkPP<T> prev = first;
        while(curr.data.getId() != id) {
            if (curr.next == null)
                return null;
            else {
                prev = curr;
                curr = curr.next;

            }
        }
        if (curr == first)
            first = first.next;
        else
            prev.next = curr.next;
        return curr.data;

    }
    //------------------------------
}
