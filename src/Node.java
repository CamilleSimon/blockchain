import java.util.ArrayList;
import java.util.List;

public class Node {

	private List<Block> blockchain;
	public int id;
	
	public Node(int id){
		this.id = id;
		this.blockchain = new ArrayList<Block>();
	}
	
	public Node(int id, List<Block> blockchain){
		this(id);
		this.blockchain = blockchain;
	}
}
