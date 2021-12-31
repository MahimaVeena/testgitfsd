package LinkedList;

public class CircularLinkedList {

    public Node head;

    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            next = null;
        }
    }

    public CircularLinkedList(){
         this.head = null;
    }

    // Time Complexity: O(n)
    // Return the head node's reference of the list
    public void append(int val){
         // Create a new node
        Node newNode = new Node(val);

        // If the list is empty
        if(head == null){
            head = newNode;
        }
        else{
            // Get the last node
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            // Update last node's next pointer to the new node
            temp.next = newNode;
        }
        newNode.next = head;
    }

    // Time complexity: O(n)
    // Traverse the list and print each element in the order
    public void printList(){
        // Traverse the list
        Node temp = head;
        if(head != null) {
            while (temp.next != head) {
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.print(temp.val+" ");
        }
        System.out.println();
    }
}