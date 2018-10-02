package LinkedList;

public class LinkedList {
    private int length = 0;
    private Node startingNode;

    public void push(int item) {
        if (this.startingNode == null) this.startingNode = new Node(item);
        else this.startingNode.push(item);
        this.length++;
    }

    public int remove(int index) {
        if (index < 0 || index >= this.length) throw new java.lang.Error("Error: Index out of bounds.");

        this.length--;
        if (index == 0) this.startingNode = this.startingNode.next;
        return startingNode.remove(index);
    }

    public int get(int index) {
        return this.startingNode.get(index);
    }

    public int getLength() {
        return this.length;
    }

    public String toString() {
        String str = "[";
        Node currNode = this.startingNode;

        for (int i = 0; i < this.length; i++) {
            if (!str.equals("[")) str += ", ";
            str += Integer.toString(currNode.item);
            currNode = currNode.next;
        }

        return str + ']';
    }
}
