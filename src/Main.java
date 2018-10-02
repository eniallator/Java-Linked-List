import LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(8);
        list.push(9);
        list.push(2);

        System.out.println(list.remove(2));

        list.push(1);

        System.out.println(list.toString());
        System.out.println(list.get(1));
        System.out.println(list.getLength());
    }
}
