package search;

public class RedBlackBST
{

	private static final boolean RED = true;
	private static final boolean BLACK = false;
	private class Node
	{
		String key; // key
		Node left, right; // subtrees
		int N; // # nodes in this subtree
		boolean color; // color of link from
		// parent to this node
		Node(String key,  int N, boolean color)
		{
			this.key = key;
			this.N = N;
			this.color = color;
		}
	}
	private boolean isRed(Node x)
	{
		if (x == null) return false;
		return x.color == RED;
	}

	Node rotateLeft(Node h)
	{
		System.out.println ("rotate left called: root:" + h.key + "left:"+((h.left==null)?"null":h.left.key) + " right " + ((h.right==null)?"null":h.right.key));
		Node x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = RED;
		x.N = h.N;
		h.N = 1 + size(h.left)
		+ size(h.right);
		System.out.println ("rotate left called: root:" + x.key + "left:"+((x.left==null)?"null":x.left.key) + " right " + ((x.right==null)?"null":x.right.key));

		return x;
	}


	Node rotateRight(Node h)
	{
		System.out.println ("rotate right called: root:" + h.key + "left:"+((h.left==null)?"null":h.left.key) + " right " + ((h.right==null)?"null":h.right.key));
		
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = RED;
		x.N = h.N;
		h.N = 1 + size(h.left)
		+ size(h.right);
		System.out.println ("rotate right called: root:" + x.key + "left:"+((x.left==null)?"null":x.left.key) + " right " + ((x.right==null)?"null":x.right.key));

		return x;
	}

	void flipColors(Node h)
	{
		h.color = RED;
		h.left.color = BLACK;
		h.right.color = BLACK;
	}


	private int size (Node h ) {
		if (h == null)
			return 0;
		return h.N;
	}

	private Node root;
	
	public void put(String key)
	{ // Search for key. Update value if found; grow table if new.
		root = put(root, key);
		root.color = BLACK;
	}
	private Node put(Node h, String key)
	{
		if (h == null) // Do standard insert, with red link to parent.
			return new Node(key, 1, RED);
		int cmp = key.compareTo(h.key);
		if (cmp < 0) 
			h.left = put(h.left, key);
		else if (cmp > 0) 
			h.right = put(h.right, key);
		if (isRed(h.right) && !isRed(h.left)) 
			h = rotateLeft(h);
		if (isRed(h.left) && isRed(h.left.left)) 
			h = rotateRight(h);
		if (isRed(h.left) && isRed(h.right)) 
			flipColors(h);
		h.N = size(h.left) + size(h.right) + 1;
		return h;
	}
	
	private void printNode(Node h) {
		if (h != null) {
//			System.out.println ("Node: (key:" + h.key + " color:" + ((h.color)?"red":"black") + " size: " + h.N + " Left: " + ((h.left != null) ? h.left.key:"null" ) + "  Right: " + ( (h.right != null) ?h.right.key:"null") + ")");
			System.out.println ("(" + h.key + ","+ ((h.color)?"R":"B") + "," + h.N + ")->(" + ((h.left != null) ? h.left.key:"null" ) +")("+ ( (h.right != null) ?h.right.key:"null") + ")");
			printNode(h.left);
			printNode(h.right);
		}
		
	}
	
	
	public static void main (String[] args) {
			String vals[] =  {"Susan","Edmund","Aslan","Rilian","Caspian","Helen","Tumnus","Miraz","Peter","Lucy"};
			RedBlackBST bst = new RedBlackBST();
			for (String val:vals) {
				System.out.println("Adding:" + val);
				bst.put(val);
				bst.printNode (bst.root);
			}
			
	}
	
}