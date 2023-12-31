import java.util.*;

public class PotiPoGrafu {
	
	private static Node[] nodes;
	private static List<List<Node>> paths = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		nodes = new Node[n];
		for(int i = 0; i < n; i++) {
			nodes[i] = new Node(i);
		}
		
		for(int i = 0; i < m; i++) {
			nodes[sc.nextInt()].addPath(nodes[sc.nextInt()]);
		}
		
		generatePaths(nodes[sc.nextInt()], nodes[sc.nextInt()], new ArrayList<>());
		
		paths.forEach(path -> System.out.println(formatPath(path)));
	}
	
	private static void generatePaths(Node current, Node end, List<Node> path) {
		if(current.equals(end)) {
			paths.add(new ArrayList<>(path));
			return;
		}
		
		if(path.isEmpty()) path.add(current);
		
		for(Node connection : current.getConnections()) {
			if(path.contains(connection)) continue;

			path.add(connection);
			generatePaths(connection, end, path);
			path.remove(connection); // backtracking
		}
	}
	
	private static String formatPath(List<Node> path) {
		StringBuilder str = new StringBuilder();
	
		for(Node node : path) {
			str.append(node.getIndex());
			if (node != path.get(path.size() - 1)) str.append(" ");
		}
		
		return str.toString();
	}
}

class Node {
	
	private int index;
	private List<Node> connections;
	
	public Node(int index) {
		this.index = index;
		connections = new ArrayList<>();
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public List<Node> getConnections() {
		return this.connections;
	}
	
	public void addPath(Node node) {
		connections.add(node);
	}
}