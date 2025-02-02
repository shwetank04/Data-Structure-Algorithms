package main;

public class Main {

	public static void main(String[] args) {
		Node node = new Node(5);
		node.right = new Node(3);
		node.left = new Node(8);
		inorderTraversal(node);
		
	}

	private static void inorderTraversal(Node node) {
		if(node == null) {
			return;
		}
		inorderTraversal(node.left);
		System.out.println(node.data);
		inorderTraversal(node.right);
	}
}

