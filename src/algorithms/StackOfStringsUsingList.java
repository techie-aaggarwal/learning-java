package algorithms;

public class StackOfStringsUsingList {
	Node first = new Node("first");
	
	class Node{
		String name;
		Node next;
		
		public Node(String name) {
			this.name = name;
		}
	}
	
	public void push(String name) {
		Node newNode = new Node(name);
		newNode.next = first;
		first = newNode;
		
	}
	
	public void pop()

}
