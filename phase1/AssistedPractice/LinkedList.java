package AssistedPractice;
import java.io.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue; 
public class LinkedList implements Queue<String> {
	Node head; // head of list 
	static class Node 
{ 
    		int data; 
    		Node next; 
    		Node(int d) 
    		{ 
        			data = d; 
        			next = null; 
    		} 
	} 
//Method to insert a new node 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
    		// Create a new node with given data 
    		Node new_node = new Node(data); 
    		new_node.next = null; 
		// If the Linked List is empty, then make the new node as head 
    		if (list.head == null) 
{ 
        			list.head = new_node; 
    		} 
    		else 
{ 
        			// Else traverse till the last node and insert the new_node there 
        			Node last = list.head; 
        			while (last.next != null) 
{ 
            			last = last.next; 
        			} 
			// Insert the new_node at last node 
        			last.next = new_node; 
    		} 
    		return list; 
	} 
	public static void printList(LinkedList list) 
	{	 
    		Node currNode = list.head; 
    		System.out.print("LinkedList: "); 
    		// Traverse through the LinkedList 
    		while (currNode != null) 
{ 
        			// Print the data at current node 
        			System.out.print(currNode.data + " "); 
        			// Go to next node 
        			currNode = currNode.next; 
    		} 
    		System.out.println(); 
	} 
	// Method to delete a node in the LinkedList by KEY 
	public static LinkedList deleteByKey(LinkedList list, int key) 
	{ 
    		// Store head node 
    		Node currNode = list.head, prev = null; 
    		If (currNode != null && currNode.data == key); 
{ 
        			list.head = currNode.next; // Changed head 
        			System.out.println(key + " found and deleted"); 
        			return list; 
    		} 
	} 

	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		/* Start with the empty list. */
		LinkedList list = new LinkedList(); 
		// Insert the values 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8); 
		// Print the LinkedList 
		printList(list); 
		// Delete node with value 1 
		deleteByKey(list, 1); 
		// Print the LinkedList 
		printList(list); 
		// Delete node with value 4 
		deleteByKey(list, 4); 
		// Print the LinkedList 
		printList(list); 
		// Delete node with value 10 
		deleteByKey(list, 10); 
		// Print the LinkedList 
		printList(list); 
}
	public void sortedInsert(Node temp) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean addAll(Collection<? extends String> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(String e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String element() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean offer(String e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String poll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String remove() {
		// TODO Auto-generated method stub
		return null;
	} 
} 


	
