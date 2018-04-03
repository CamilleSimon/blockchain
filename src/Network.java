import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.graphstream.graph.Node;

public class Network{
	
	private List<Node> nodes;
	private List<Edge> edges;
	
	public Network(int n, double density){
		this.nodes = generateNodes(n);
		this.edges = generateEdges(density);
	}
	
	private List<Node> generateNodes(int n){
		List<Node> nodes = new ArrayList<Node>();
		for(int i = 0; i < n; i++){
			nodes.add(new Node(i));
		}
	}
	
	private List<Edge> generateEdges(double density){
		Random rnd = new Random();
		int c = 0;
		List<Edge> edges = new ArrayList<Edge>();
		for(int i = 0; i < nodes.size(); i ++)
			for(int j = i+1; j < nodes.size(); j++)
				if(rnd.nextDouble() <= density){
					edges.add(c, i, j);
					c++;
				}
	}
	
	
}
