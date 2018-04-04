import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Network{
	
	private List<Node> nodes;	//List of nodes of the network
	private List<Edge> edges;	//List of edges of the network
	
	/**
	 * Generate a random graph with n nodes and a probability to have an edge between to nodes defined by density.
	 * @param n Number of nodes
	 * @param density	Probability to add an edge
	 */
	public Network(int n, double density){
		//Add n nodes to the list
		this.nodes = new ArrayList<Node>();
		for(int i = 0; i < n; i++){
			nodes.add(new Node(i));
		}
		
		//Add edges to the list with a creation probability equal to density
		this.edges = new ArrayList<Edge>();
		Random rnd = new Random();
		int c = 0;
		for(int i = 0; i < nodes.size(); i ++)
			for(int j = i+1; j < nodes.size(); j++)
				if(rnd.nextDouble() <= density){
					edges.add(new Edge(c, nodes.get(i), nodes.get(j)));
					c++;
				}
	}
	
	/**
	 * Return the i th node of the list
	 * @param i
	 * @return
	 */
	public Node getNode(int i){
		return nodes.get(i);
	}
	
	/**
	 * Return the node with id = i
	 * @param i
	 * @return
	 */
	public Node getNodeId(int i){
		for(Node n : nodes)
			if(n.getId() == i)
				return n;
		return null;
	}
	
	/**
	 * Return the i th edge of the list
	 * @param i
	 * @return
	 */
	public Edge getEdge(int i){
		return edges.get(i);
	}
	
	/**
	 * Return the edge with id = i
	 * @param i
	 * @return
	 */
	public Edge getEdgeId(int i){
		for(Edge e : edges)
			if(e.getId() == i)
				return e;
		return null;
	}
	
	/**
	 * Return the number of nodes in the network
	 * @return
	 */
	public int numberOfNodes(){
		return nodes.size();
	}
	
	/**
	 * String version of the network
	 */
	public String toString(){
		String s = "Nodes = " + nodes + "\n";
		s += "Edges = " + edges + "\n";
		return s;
	}
}
