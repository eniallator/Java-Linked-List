package LinkedList;

public class Node {
    Node next;
    int item;

    Node(int item) {
        this.item = item;
    }

    void push(int newItem) {
        if (this.next != null) this.next.push(newItem);
        else this.next = new Node(newItem);
    }

    int get(int index) {
        if (index < 0) throw new java.lang.Error("Error: Indexes can't be negative");
        else if (index == 0) return this.item;
        else if (this.next == null) throw new java.lang.Error("Error: Index does not exist");
        else return this.next.get(index - 1);
    }

    int remove(int index) {
        if (index == 1) {
            int valueRemoved = this.next.item;
            this.next = this.next.next;
            return valueRemoved;
        } else {
            return this.next.remove(index - 1);
        }
    }
}
