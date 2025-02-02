public class Main {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.right.left = new Node(4);
		
	}
}


package main;

public class Node {
	
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
	}
	
}


