package LinkedListImplementation;

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node(); //creates a new node
        node.data = data; //adds an integer value to the node
        node.next = null;

        if(head == null) //if the list is empty
        {
            head = node; // the node itself is a head
        }
        else
        {
            Node n = head; //created a node and made it head
            while(n.next != null) //if the temporary node is not null, continue
            {
                n = n.next; //this is used to traverse through the nodes
            }
            n.next = node;
        }
    }

    public void delete(int data) {
        Node n = head;
        Node prev = null;
        while(n != null) {
            if(n.data == data) {
                if(prev == null) {
                    head = n.next;
                }
                else {
                    prev.next = n.next;
                }
            }
            prev = n;
            n = n.next;
        }
    }

    public void show()
    {
        Node node = head;
        while(node.next != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

