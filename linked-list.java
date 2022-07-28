import java.util.LinkedList;

public class Node {
    int data; // data stored in this node
    public Node next; // reference to the next node in the list
    public Node(int data) {
        this.data = data; // initialize data
    }
}
public class LinkedList {
    public Node head; // reference to the first node in the list

    public void append(int data) {
        
        if (head == null) { // if the list is empty
            head = new Node(data); // create a new node
            return;
        }
        Node current = head; // start at the head
        while(current.next != null) { // iterate to the end of the list
            current = current.next; // move to the next node
        }
        current.next = new Node(data); // create a new node
    }

    public void prepend(int data) { // add a node to the beginning of the list
        Node newHead = new Node(data); // create a new node
        newHead.next = head; // point the new node to the current head
        head = newHead; // set the new head
    }

    public void deleteWithValue(int data) { // delete a node with a given value
        if (head == null) { // if the list is empty
            return; // do nothing
        }
        if (head.data == data) { // if the head has the value
            head = head.next; // set the head to the next node
            return; // we're done
        }
        Node current = head; // start at the head
        while(current.next != null) { // iterate to the end of the list
            if (current.next.data == data) { // if we found the node
                current.next = current.next.next; // delete the node
                return; // we're done
            }
            current = current.next; // move to the next node
        }
    }
}