package inheritance;

public class DataNodeClient {
public static void main(String[] args) {
	//no one is better than ram
	//and hence this is last node
	DataNode<String> node2 = new DataNode<String>("jai shree ram", null);
	
	DataNode<String> node1 = new DataNode<String>("jai hanuman", node2);
	
	DataNode<String> node3 = new DataNode<String>("jai radha madhav", node1);
	System.out.println(node3);
	
	DataNode<String> node6 = new DataNode<String>("jai uma maheshwar", null);
	DataNode<Integer> node5 = new DataNode<Integer>(109, node6);
	DataNode<Number> node4 = new DataNode<Number>(108, node5);
	System.out.println(node4);
}
}
