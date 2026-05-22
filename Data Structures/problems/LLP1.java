class Node{
    int data; // stores the value 
    Node next; // points to the next node

    Node(int data) {
        this.data = data;
        this.next = null; // no next node when first one is created

    }
}
class LinkedList{
    Node head; // starting of the list

    LinkedList() {
        this.head = null; // empty list a
    }

}
public void addFirst(int data){
    Node newNode = new Node(data);
    newNode.next = head; // new node points to current head
    head = newNode.next; // new node becomes the new head
}

public int search(int target) {
    Node current = head;
    int index = 0;

    while(current != null) {
        if(current.data == target) {
            return index;
        }
        current = current.next;
        index++;
    }
    return -1;
}

public class LLP1 {
    public static void main(String[] args) {
    LinkedList ll = new LinkedList();

    int[] elements = {1,5,7,3,8,2,3};
    for(int num: elements) {
        ll.addFirst(num);
    }
    int result = ll.search(7);
    if(result != -1) {
        System.out.println("Number 7 found at index: " + result);
    } else{
        System.out.println("Number 7 not found! ");
    }
    
 }
}


