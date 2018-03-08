import java.security.MessageDigest;

public class Util {

	/**
	 * Generate the hash of the block passed in parameter.
	 * @param b 
	 * @return
	 */
	public static String calculateHash(Block b){
		if(b != null){
			String input = "" + b.getIndex() + b.getPreviousHash().toString() + b.getData();
			try {
				MessageDigest digest = MessageDigest.getInstance("SHA-256");	        
				final byte[] hash = digest.digest(input.getBytes("UTF-8"));	        
				StringBuffer hexString = new StringBuffer();
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
}
