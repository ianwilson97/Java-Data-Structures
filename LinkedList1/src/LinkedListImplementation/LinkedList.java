package LinkedListImplementation;

public class LinkedList {
    Node head;

    public LinkedList() {
        head = null; // Initialize head to null
    }

    public void add(int data) {
        Node newNode = new Node(); //this creates a new node to be added to the list
        newNode.data = data; //this sets the data of the new node to the data that was passed in
        newNode.next = null; //this sets the pointer to the next node to null

        if (head == null) { //if the list is empty, then the new node is the head of the list
            head = newNode;
        } else { //if the list is not empty
            Node current = head; //this creates a node to be used to traverse the list
            while (current.next != null) { //this will traverse the list until it reaches the end
                current = current.next; //this moves the current node to the next node
            }
            current.next = newNode; //this sets the pointer to the next node to the new node. adding to the end of the list
        }
    }

    public void delete(int data) {
        if(head == null) { //if the list is empty, just return
            return;
        }
        if(head.data == data) { //if the head is the data to be deleted, set the head to the next node
            head = head.next;
            return;
        }
        Node current = head; //this creates a node to be used to traverse the list
        while(current.next != null) { //this will traverse the list until it reaches the end
            if(current.next.data == data) { //if the next node is the data to be deleted, set the next node pointer to the next next node
                current.next = current.next.next; //this sets the pointer of the current node to the next next node
                return;
            }
            current = current.next; //this moves the current node to the next node
        }
    }

    public void print() { //this prints the list
        Node current = head; //this creates a node to be used to traverse the list
        while(current != null) { //this will traverse the list until it reaches the end
            System.out.print(current.data + " "); //this print the data of the current node
            current = current.next; //this moves the current node to the next node
        }
        System.out.println();
    }

    public void get(int index) {
        Node current = head; //this creates a node to traverse the list with
        int count = 0;
        while(current != null) { //this will traverse the list until it reaches the end
            if(count == index) { //if the count is the index
                System.out.println(current.data); //print the data of the current node
                return;
            }
            current = current.next; //this moves the current node to the next node
            count++; //this increments the counter up by 1
        }
    }

    public void insertAtStart(int data) { //this function inserts a node at the start of the list
        Node newNode = new Node(); //create new node
        newNode.data = data; //assign data to new node
        newNode.next = head; //assigns the next node to the head
        head = newNode; //assigns the head to the new node
    }

    public void insertAt(int index, int data) { //this function inserts data at a certain index
        Node newNode = new Node(); //this creates a new node to be added to the list
        newNode.data = data; //this inserts the data into the new node
        newNode.next = null; //this sets the pointer of the new node to null
        if(index == 0) { //if the index is 0, then the new node is the head of the list
            newNode.next = head; //sets pointer of new node to the head
            head = newNode; //sets the head to the new node
        } else {
            Node current = head; //makes the current node the head
            int count = 0;
            while(current != null) { //this will traverse the list until it reaches the end
                if(count == index - 1) { //if count is the index minus 1, then the new node is inserted after the current node
                    newNode.next = current.next; //this sets the pointer of the new node to the next node
                    current.next = newNode; //this sets the pointer of the current node to the new node
                    return;
                }
                current = current.next; //this moves to the next node
                count++;
            }
        }
    }
}
