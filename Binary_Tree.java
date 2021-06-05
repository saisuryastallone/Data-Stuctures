
public class Binary_Tree {
	
	public Node rootNode;
	
	// Let's create a Node class to represent nodes for the rest of the program
	class Node {
		public int value;
		public Node leftChild;
		public Node rightChild;
	}
	
	// Let's initialize the root node upon the constructor call early on
	Binary_Tree(int data){
		rootNode = new Node();
		rootNode.value = data;
		rootNode.leftChild = null;
		rootNode.rightChild = null;
		
	}
	
	// Let's insert child nodes from here
	public boolean insert(int item) {
		
		Node parent = rootNode;
		Node child = rootNode;
		
		Node n = new Node() ;
		n.value = item;
		n.leftChild = null;
		n.rightChild = null;
		
		
		while(child!=null){
			
			parent = child;
			if(n.value > child.value) {
				
				child = child.rightChild;
				
			}
		
			else {
				
				child = child.leftChild;
			}
			}
		
			if(parent.value > n.value) {
				parent.leftChild = n;
				System.out.println("Inserted node "+n.value+" to the left of the node "+parent.value);
			}
			else {
				parent.rightChild = n;
				System.out.println("Inserted node "+n.value+" to the right of the node "+parent.value);
			}
		
		
			return true;
		
	}
	
	
	// Finally, let's display our tree
	public void showTree(Node n) {
		
		if(n!=null) {
			
			showTree(n.leftChild);
			System.out.println(n.value);
			showTree(n.rightChild);
			 }
		}
		
	}
	
