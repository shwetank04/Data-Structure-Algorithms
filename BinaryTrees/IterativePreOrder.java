public class Main {

	public static void main(String[] args) {
		Node node = new Node(5);
		node.right = new Node(8);
		node.left = new Node(3);
		List<Integer> list = new ArrayList<>();
		Stack<Node> stack = new Stack<>();
		stack.push(node);
		while(!stack.isEmpty()) {
			node = stack.pop();
			list.add(node.data);
			if(node.right!=null) {
				stack.push(node.right);
			}
			if(node.left!=null) {
				stack.push(node.left);
			}
		}
		System.out.println(list);
	}
}
