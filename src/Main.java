public class Main {

	public static void main(String[] args) {
		Miner n = new Miner(0);
		Block b0 = n.newBlock("AAA");
		n.addBlock(b0);
		Block b1 = n.newBlock("AAB");
		n.addBlock(b1);
		System.out.println(n);
		
		Network ntwk = new Network(5, 1);
		System.out.println(ntwk);
	}
}
