package dataStructures.trees;

public class Node {
    int iData;
    double fData;
    Node leftChild;
    Node rightChild;

    public Node(int iData, double fData) {
        this.iData = iData;
        this.fData = fData;
    }

    @Override
    public String toString() {
        return "Node{" +
                "iData=" + iData +
                ", fData=" + fData +
                '}';
    }
}
