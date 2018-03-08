import java.util.Date;

public class Block {

	private int index;				//position of the Block in the list
	private String hash;			//hash of the current Block in function of index, prevHash, data and timestamp
	private String previousHash;	//hash of the previous Block on the list 
	private String data;			//data save in the block
	private long timeStamp; 		//number of milliseconds since 1/1/1970.
	
	/**
	 * Constructor of blocks.
	 * @param index Position on the list.
	 * @param previousHash	Hash of the previous Block.
	 * @param data	Data to save.
	 */
	public Block(int index, String previousHash, String data){
		this.index = index;
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = Util.calculateHash(this);
	}
	
	/**
	 * Return the index of the block in the list
	 * @return Return an int the position on the list
	 */
	public int getIndex() {
		return index;
	}
	
	/**
	 * Return the hash of the current block
	 * @return
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * Return the hash of the previous block on the list. If first block.
	 * @return
	 */
	public String getPreviousHash() {
		return previousHash;
	}
	
	/**
	 * Return data saved on the block
	 * @return
	 */
	public String getData() {
		return data;
	}

	/**
	 * Return the timestamp of the creation of the block.
	 * @return
	 */
	public long getTimeStamp() {
		return timeStamp;
	}

	/**
	 * String version of the block.
	 */
	public String toString() {
		return "Block "+index+" [hash=" + hash + ", previousHash=" + previousHash + ", data=" + data + ", timeStamp=" + timeStamp
				+ "]\n";
	}
}
