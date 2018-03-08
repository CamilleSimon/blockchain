
public class Main {

	public static void main(String[] args) {
		Block b0 = new Block(0, "0", "Hello World");
		System.out.println(b0);
		Block b1 = new Block(1, b0.getHash(), "Second block");
		System.out.println(b1);

	}

}
