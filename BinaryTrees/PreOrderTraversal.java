package main;

public class Main {

	public static void main(String[] args) {
		Node node = new Node(5);
		node.right = new Node(3);
		node.left = new Node(8);
		preorderTraversal(node);
		
	}

	private static void preorderTraversal(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.data);
		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}
}

