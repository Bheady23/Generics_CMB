package linkedlist;
/**
 * This class models a Node object that can contain any type of object. Each
 * node has its internal data and pointers to the next 
 * node in the list.
 * Changed class name to GenericNode<T> so that it implements Generics 
 * which allows the class to be parameterized to any type of object
 * @author rkelley/njohnson and Chris Burkhead
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericNode<T> {
		
		private T data;  //data that the object stores, changed from String to T variable
		private GenericNode<T> nextNode; //pointer to the nextNode that will be in GenericLinkedList, changed from Node to GenericNode<T>
		
		/**
		 * Constructor builds GenericNode object. Initializes nextNode and data
		 * to null.
		 */
		public GenericNode()
		{
			setNextNode(null);
			data=null;
		}//end empty-argument constructor
		
		/**
		 * This method sets the data of the object.
		 * Data type changed from (String data) to (T data) 
		 * @param data
		 */
		public void setData(T data) {
			this.data=data;
		}//end setData
		
		/**
		 * This method returns the data of the object.
		 * @returns changed return Type from String to T
		 */
		public T getData() {
			return this.data;
		}//end getData
		
		/**
		 * This method returns itself to the caller, had to modify the return type to GenericNode<T> so it can support 
		 * any data type.
		 * @return
		 */
		public GenericNode<T> getNode() {
			return this;
		}//end getNode
		
		/**
		 * This method updates the pointer for the next node.
		 * Had to changed the data type requested from Node to GenericNode<T> 
		 * @param nextNode
		 */
		public void setNextNode(GenericNode<T> nextNode)
		{
			this.nextNode=nextNode;
		}//end setNextNode
		
		/**
		 * This method returns the node stored in the next node pointer, had to change the return type 
		 * to GenericNode<T> so it can support whatever date type is entered.
		 * @return Node object
		 */
		public GenericNode<T> getNextNode() {
			return nextNode;
		}//end getNextNode
		
}
