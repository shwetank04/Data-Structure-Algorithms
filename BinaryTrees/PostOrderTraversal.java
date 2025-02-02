public class Main {

	public static void main(String[] args) {
		Node node = new Node(5);
		node.right = new Node(3);
		node.left = new Node(8);
		postOrderTraversal(node);
		
	}

	private static void postOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.println(node.data);
	}
}
