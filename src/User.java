import java.util.ArrayList;
import java.util.List;

import org.graphstream.graph.Node;

public interface User extends Node {

	protected List<Block> blockchain;	//Copie of the Blockchain
	public int id;						//Id of the node
	
	/**
	 * Constructor with an empty blockchain
	 * @param id
	 */
	public User(int id){
		this(id, new ArrayList<Block>());
	}
	
	/**
	 * Constructor with a blockchain passed in paramter
	 * @param id
	 * @param blockchain
	 */
	public Node(int id, List<Block> blockchain){
		this.id = id;
		this.blockchain = blockchain;
	}
	
	/**
	 * Return the id of the node
	 * @return
	 */
	public int getId(){
		return id;
	}
	
	/**
	 * String version of the node
	 */
	public String toString(){
		return "{id = " + id + ", BC = " + blockchain + "}";
	}
}
