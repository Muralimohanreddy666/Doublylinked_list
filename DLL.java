class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL {
    Node head;

    public void InsertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    
    public void InsertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

   
    public void deleteFirst() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void display() {
        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.InsertAtBeginning(40);
        list.InsertAtBeginning(50);
        list.InsertAtEnd(60);
        list.InsertAtEnd(70);

        list.display();  

        list.deleteFirst();

        list.display();  
    }
}