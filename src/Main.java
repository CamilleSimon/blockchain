public class Main {

	public static void main(String[] args) {
		Miner n = new Miner();
		Block b0 = n.newBlock("Hello World !");
		n.addBlock(b0);
		Block b1 = n.newBlock("Second Block");
		n.addBlock(b1);
		System.out.println(n);
		
		Network ntwk = new Network("Network", 10, 1);
		ntwk.display();
	}
}
