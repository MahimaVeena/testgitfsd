package LinkedList;

import LinkedList.CircularLinkedList.Node;

public class Main {

	public static void main(String[] args) throws Exception {
		CircularLinkedList list=new CircularLinkedList();
		list.append(1);
	    list.append(2);
		list.append(3);
		list.append(4);
		list.append(5);
		list.append(6);
		list.append(7);
		list.append(8);

		list.head=JosephusCircle(list.head,4);
		System.out.println(list.head.val);
		
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.append(1);
		sll.append(2);
		sll.append(3);
		sll.append(4);
		sll.append(5);
		sll.append(6);
		sll.append(7);
		sll.append(8);
		
			LinkedList.SinglyLinkedList.Node kthNode=KthNodeFromEnd(sll.head,4);
			System.out.println("the kth node is "+kthNode.val);
	}

	public static Node JosephusCircle(Node head, int k) throws Exception {
		
		if(head==null) {
			throw new Exception("The list is empty");
		}
		
		else if(head.next==head) {
			return head;
		}
		
		while(head!=head.next) {
			Node temp=head;
		for(int i=1;i<k-1;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		head=temp.next;
		
	}
	return head;	
}
	
	public static LinkedList.SinglyLinkedList.Node KthNodeFromEnd(SinglyLinkedList.Node head, int k) throws Exception {
		if(k<=0 || head==null) {
			throw new Exception("wrong arguments passed");
		}
		LinkedList.SinglyLinkedList.Node slow=head;
		LinkedList.SinglyLinkedList.Node fast=head;
		
		for(int i=1;i<k;i++) {
			if(fast.next==null) {
				throw new Exception("k is less than linked list size");
			}
			fast=fast.next;
		}
		
		while(fast.next!=null) {
			fast=fast.next;
			slow=slow.next;
		}
		
		return slow;
	}
}
