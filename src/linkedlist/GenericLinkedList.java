package linkedlist;
/**
 * This class models a linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after.
 * Changed class name to GenericLinkedList<T> so that is can implement Generics 
 * @author rkelley/njohnson and Chris Burkhead
 * Programming Project 3 Start Project
 * CS131ON
 */
public class GenericLinkedList<T> {
	
	private GenericNode<T>  head; //node to represent the head of the list, modified Variable Type to GenericNode<T>
	private GenericNode<T> tail; //node to represent the tail (end) of the list, modified Variable Type to GenericNode<T>
	private int length; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 * Changed constructor names to reflect class change
	 */
	public GenericLinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end empty-argument constructor
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	
	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * Changed variable return type to GenericNode<T> to reflect change made above
	 * @return
	 */
	public GenericNode<T> getList()
	{
		return head;
	}//end getList
	
	/**
	 * This method adds a new node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * Changed data type to GenericNode<T> to allow any type of data to be entered 
	 * and changed variable name to iNode to avoid conflict with Node class. 
	 * @param <T>
	 * @param aNode
	 */
	public void addNode(GenericNode<T> iNode)
	{
		if (isEmpty() ) {
			head = iNode;
			tail=head;
			return;
		}
		
		tail.setNextNode(iNode);
		tail=tail.getNextNode();
		tail.setNextNode(null);
		length++;
		
	}//end addNode

}//end class
