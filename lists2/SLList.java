//package lists2;

/** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList {
	// static nested class: can not access any of the members of
	// the enclosing class; can create static nested class without
	// having an instance of the enclosing class
	public static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n){
			item = i;
			next = n;
		}
	}
//	public IntNode first;
	// accessible to code in current java file only
	private IntNode first;
	private int size;
	public SLList(int x){
		first = new IntNode(x, null);
		size = 1;
	}

	public SLList(){
		first = null;
		size = 0;
	}

	// simple helper functions
	public void addFirst(int x){
		first = new IntNode(x, first);
		size += 1;
	}
	public int getFirst(){
		return first.item;
	}

	public void addLast(int x){
		// size of list may be longer than 1
		// first.next = new IntNode(x, null); Incorrect
		size += 1;

		if (first == null){
			first = new IntNode(x, null);
			return;
		}
		IntNode p = first;

		while (p.next != null){
			p = p.next;
		}
		p.next = new IntNode(x, null);
	}
	// overloaded
	// updated size when create and add elements to list
//	private static int size(IntNode p){
//		if (p.next == null){
//			return 1;
//		}
//		return 1 + size(p.next);
//	}
//
	public int size(){
//		return size(first);
		return size;
	}
}


















