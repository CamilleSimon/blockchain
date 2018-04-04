
public class Edge {
	private Node n1;
	private Node n2;
	private int id;
	
	public Edge(int id, Node n1, Node n2){
		this.n1 = n1;
		this.n2 = n2;
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public String toString(){
		return "{id = " + id + ", nodes = <" + n1.getId() + "," + n2.getId() + ">}";
	}
}
