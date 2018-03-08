import java.util.Date;
import java.security.MessageDigest;

public class Block {

	private int index;
	private String hash;
	private String previousHash;
	private String data;
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	
	public Block(int index, String previousHash, String data){
		this.index = index;
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculHash(this);
	}
	
	public int getIndex() {
		return index;
	}

	public String getHash() {
		return hash;
	}

	public String getPreviousHash() {
		return previousHash;
	}

	public String getData() {
		return data;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	private String calculHash(Block b){
		if(b != null){
			String input = "" + b.getIndex() + b.getPreviousHash().toString() + b.getData();
			try {
				MessageDigest digest = MessageDigest.getInstance("SHA-256");	        

				final byte[] hash = digest.digest(input.getBytes("UTF-8"));	        
				StringBuffer hexString = new StringBuffer(); // This will contain hash as hexidecimal
				for (int i = 0; i < hash.length; i++) {
					String hex = Integer.toHexString(0xff & hash[i]);
					if(hex.length() == 1) hexString.append('0');
						hexString.append(hex);
				}
				return hexString.toString();
			}
			catch(Exception e) {
				throw new RuntimeException(e);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Block "+index+" [hash=" + hash + ", previousHash=" + previousHash + ", data=" + data + ", timeStamp=" + timeStamp
				+ "]";
	}
	
	
}
