import java.util.ArrayList;
import java.util.List;
import org.graphstream.graph.Node;

public class Miner{

	private List<Block> blockchain; 
	
	/**
	 * Creation of a node with an empty blockchain.
	 */
	public Miner(){
		blockchain = new ArrayList<Block>();
	}
	
	/**
	 * Creation of a node with the blockchain passed in parameter
	 * @param blockchain
	 */
	public Miner(List<Block> blockchain){
		this.blockchain = blockchain;
	}
	
	/**
	 * Number of blocks in the list
	 * @return
	 */
	public int numberOfBlocks(){
		return blockchain.size();
	}
	
	/**
	 * Return the last block of the list
	 * @return
	 */
	public Block lastBlock(){
		if(blockchain.size() > 0)
			return blockchain.get(blockchain.size() - 1);
		return null;
	}
	
	/**
	 * Create a new block with the data passed in parameter
	 * @param data
	 * @return
	 */
	public Block newBlock(String data){
		Block lastestBlock = lastBlock();
		if(lastestBlock != null)
			return new Block(lastestBlock.getIndex() + 1, lastestBlock.getHash(), data);
		return new Block(0, "0", data);
	}
	
	/**
	 * Add a block to the list, return true if the block is added.
	 * @param b
	 * @return
	 */
	public boolean addBlock(Block b){
		if(b != null){
			blockchain.add(b);
			return true;
		}
		return false;
	}
	
	/**
	 * Return the list as a string
	 */
	public String toString(){
		String s = "";
		if(blockchain.size() > 0){
			Block b;
			for(int i = 0; i < blockchain.size(); i++){
				b = blockchain.get(i);
				s += b.toString();
			}
		}
		return s;
	}
}
