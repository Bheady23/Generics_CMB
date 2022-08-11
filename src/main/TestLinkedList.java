package main;
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.GenericLinkedList;
import linkedlist.GenericNode;

/**
 * This is the main argument class for the linklist package. It is an application that tests to see if classes
 * LinkedList/Node and GenericLinkedList/GenericNode work together to make LinkedLists of different data types
 * The GenericLinkedList and GenericNode classes are modified versions by author Chris Burkhead
 * of the LinkedList/Node classes to allow Generics to be implemented. 
 * @author @author rkelley/njohnson and Chris Burkhead
 *Programming Project 3
 *CS131ON
 *version 1.0
 *Summer2022
 */
public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		System.out.println();
		//instantiating and then adding items to a GenericLinked comprised of Integers
		GenericLinkedList<Integer> intList=new GenericLinkedList<Integer>();
		
		GenericNode<Integer> iNode=new GenericNode<Integer>();
		iNode.setData(2);
		intList.addNode(iNode);
		iNode = new GenericNode<Integer>();
		iNode.setData(10);
		intList.addNode(iNode);
		
		GenericNode<Integer> intnode=intList.getList();
		do 
		{
			System.out.println(intnode.getData());
			intnode=intnode.getNextNode();
		} while (intnode!=null);
		
		System.out.println();
		//instantiating and then adding items to a GenericLinked comprised of Doubles	
		GenericLinkedList<Double> doubleList=new GenericLinkedList<Double>();
		
		GenericNode<Double> dNode=new GenericNode<Double>();
		dNode.setData(5.67891012);
		doubleList.addNode(dNode);
		dNode = new GenericNode<Double>();
		dNode.setData(10.7980115095768);
		doubleList.addNode(dNode);
		
		GenericNode<Double> doublenode=doubleList.getList();
		do 
		{
			System.out.println(doublenode.getData());
			doublenode=doublenode.getNextNode();
		} while (doublenode!=null);
		
		System.out.println();
		//instantiating and then adding items to a GenericLinked comprised of Strings
		GenericLinkedList<String> stringList=new GenericLinkedList<String>();
			
			GenericNode<String> sNode=new GenericNode<String>();
			sNode.setData("Party on Wayne");
			stringList.addNode(sNode);
			sNode = new GenericNode<String>();
			sNode.setData("Party on Garth");
			stringList.addNode(sNode);
			
			GenericNode<String> stringnode=stringList.getList();
			do 
			{
				System.out.println(stringnode.getData());
				stringnode=stringnode.getNextNode();
			} while (stringnode!=null);

	}//end main

}//end class
