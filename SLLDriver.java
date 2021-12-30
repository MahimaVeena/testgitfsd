package LinkedList;

public class SLLDriver {
	 public static void main(String[] args) throws Exception {
	        SinglyLinkedList sll = new SinglyLinkedList();
	        System.out.println(sll.isEmpty());
	      /*  sll.printList();
	        sll.append(2);
	        sll.append(23);
	        sll.append(9);
	        sll.append(17);
	        sll.printList();

	        sll.deleteFromEnd();
	        sll.printList();
	        System.out.println(sll.isEmpty());*/

	       sll.insertInLocation(0, 1);
	      sll.insertInLocation(0, 3);
	       sll.insertInLocation(2, 2);
	       sll.insertInLocation(3, 10);
	       sll.insertInLocation(4, 5);
	        sll.deleteAtLocation(2);
	        sll.deleteAtLocation(0);
	        
	      System.out.println( sll.search(10));
	        sll.printList();
	    }
}
