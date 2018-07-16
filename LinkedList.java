package ds;
class LinkedList
{
	 Node head;
	

 static class Node {

	int data;
	Node next;
	Node(int d){
	data = d;	
	next = null;
	}
 }
	public void printList(){
		Node n = head;
		while(n!=null){
			System.out.println(n.data+" ");
			n = n.next;
		}
	}
	
	public static void main(String...s){
		LinkedList ll = new LinkedList();
		ll.head = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		ll.head.next = two;
		two.next = three;
		ll.printList();
		
	}
	

}