import java.util.ArrayList;
import java.util.List;

public class Blockchain {

	private List<Block> blockchain;
	
	public Blockchain(){
		blockchain = new ArrayList<Block>();
	}
	
	public Block lastBlock(Block b){
		if(blockchain == null)
			return null;
		else{
			return blockchain.get(blockchain.size() - 1);
		}
	}
}
