package dataStructures.Lists;

public class Link {
    public int iData;
    public double dData;
    public Link next;
    //-------------------------------------
    public Link(int id, double dd)
    {
        iData = id;
        dData = dd;
    }
    //-------------------------------------
    void displayLink(){
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}
