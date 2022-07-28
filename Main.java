package LinkedListImplementation;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(12);
        list.insert(35);
        list.insert(50);
        list.delete(12);

        list.show();
    }
}
