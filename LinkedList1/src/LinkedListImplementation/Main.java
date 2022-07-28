package LinkedListImplementation;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(45);
        list.add(55);
        list.add(65);
        list.add(75);
        list.insertAtStart(18);
        System.out.println("Before deletion:");
        list.print();

        list.delete(45);
        list.delete(25);
        list.delete(65);
        System.out.println("After deletion:");
        list.print();

        System.out.println("Get at index 3:");
        list.get(2);

        System.out.println("Insert at an index 4:");
        list.insertAt(4, 22);

        list.print();
    }
}
