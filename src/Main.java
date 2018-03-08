public class Main {

	public static void main(String[] args) {
		Node n = new Node();
		Block b0 = n.newBlock("Hello World !");
		n.addBlock(b0);
		Block b1 = n.newBlock("Second Block");
		n.addBlock(b1);
		System.out.println(n);
	}
}
