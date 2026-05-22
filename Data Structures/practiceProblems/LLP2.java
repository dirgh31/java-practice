import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class ConstructLinkedList{
    Node head;

    ConstructLinkedList() {
        this.head = null;
    }
    public void addLast(int data){
    Node newNode = new Node(data);

    if(head == null){
        head = newNode;
        return; 
    }
    Node current = head;
    while(current.next != null) {
        current = current.next;
    }
    current.next = newNode;
}
public void printList(){
    Node current = head;
    while(current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
}
public void deleteGreaterThan25() {
    // C-1: Removing head which are > 25
    while(head != null && head.data > 25) {
        head = head.next; // move head forward
    }
    // C-2:  Removing the middle/end nodes that are >25
    Node current = head;
    while(current != null && current.next != null) {
        if(current.next.data > 25) {
            current.next = current.next.next; // skip the node 
        } else {
            current = current.next; // move forward 
        }
    }
  } 
}

public class LLP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConstructLinkedList ll = new ConstructLinkedList();

        System.out.print("How many elements? ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++) {
            System.out.print("Enter element(1-50): ");
            int val = sc.nextInt();
            if (val < 1 || val > 50) {
            System.out.println("Out of range! Enter between 1-50");
            i--; // retry this iteration
        } else {
            ll.addLast(val);
        }
      }
      System.out.print("Original List: ");
      ll.printList();

      ll.deleteGreaterThan25();

      System.out.print("After Deletion: ");
      ll.printList();
    }
      
}
