package com.revature.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class MainDriver {

	public static void main(String[] args) {
		
		String[] arrayString;//declaration
	
		arrayString = new String[3]; 
		
		arrayString[0]= "Hello";
		
		int[][][] arrayInt = new int[3][3][3]; //this array has 3 dimensions 3x3
		
		arrayInt[0][0][0] = 1;
		//System.out.println(arrayString[0]);
		
		arrayString = new String[10]; //updated arrayString to 10 
		
		for(String x: arrayString) {
			//System.out.println(x);
		}
		for(int[][] x: arrayInt) {
			for(int[] y:x) {
	//with arrays you have to iterate through the list manually and print out each element
	//can't resize arrays, must create new array to add more
				
			}
		}
	//COLLECTIONS
	//List- an interface 
	// like all interfaces, it does not have a constructor
	//What is a list? an ordered collection. insertion order or alphabetical or numerical
	//list allow duplicate elements 
	//access via index (position access) (get, set, add, addAll and remove)
		//list have to contain the same elements in the same order to be equal
		
		//ArrayList:resizable array (mutable) compared to the built in Array
		//LinkedList: consists of nodes. each node will store a value and a pointer to that value
		//Vector: deprecated, but is synchronized 
	List<String> stringList = new ArrayList<>(); //we're missing the size
	
	stringList.add("hello");	//if you had 2 hellos, they are the same but have different positions so it would print twice aka allows duplicates
	stringList.add("the end");
	stringList.add("goodbye");
	stringList.add(2, "number 21");
	
	stringList.listIterator();
	
	List<String> otherList = new LinkedList<>();
	
	otherList.add("Apples");
	otherList.add("Bananas");
	otherList.add("Kiwi");
	
	System.out.println(otherList);
	System.out.println(otherList.get(2));
	
	//SETS
	// you cannot have primitive values
	//we dont have access via index/position
	//doesnt allow duplicates
	//use when you cant have duplicates 
	//for a set to be equal they have to contain the same elements 
	Set<Double> mySet = new HashSet<>();
	mySet.add(100.0);
	mySet.add(200.0);
	mySet.add(300.0);
	mySet.add(250.0);
	mySet.add(210.0);	
	System.out.println(mySet.add(100.0));
	System.out.println(mySet.add(500.0));
	
	for(Double num: mySet) {
		System.out.println(num); //if(num==mynum) { syso(num); to search for a specific number in set 
	}
	System.out.println(mySet);
	
	Set<Double> myTreeSet = new TreeSet<>();
	myTreeSet.addAll(mySet);
	
	mySet.add(null);
	
	Set<String> myLinkedSet = new LinkedHashSet<>();
	
	myLinkedSet.add("DragonFruit");
	myLinkedSet.add("Watermelon");
	myLinkedSet.add("Coconut");
	System.out.println(myLinkedSet);
	
	System.out.println(myTreeSet);
	//HashSet: maintains no order, stores in hash table, best performance 
	//TreeSet: maintains value order, no null values bc null has no value to order 
	//LinkHashSet: Keep track of insertion order, weaker than HashSet, stronger than TreeSet
	
	
	//QUEUE
	//ordered list of objects related to insertion order
	//follows FIFO, can have duplicates 
	
	//DequeQueues keeps track of insertion order, allows duplicates, null values not allowed
	//faster performance specialized for instantiating a queu, only able to instantiate a queue
	//Link List can instantiate a queue and a list 
	Queue<String> myQueue= new LinkedList<>();
	myQueue.add("Mercury");
	myQueue.add("Venus");
	myQueue.add("Earth");
	myQueue.add("Earth");
	
	
	System.out.println(myQueue.poll()); //poll prints the next element in the queue
	System.out.println(myQueue.poll());
	System.out.println(myQueue.peek()); //peak to view what element is next without removing it from queue
	System.out.println(myQueue.poll());//There is also a call to remove an element 
	System.out.println(myQueue.poll());

	Queue<String> myDequeQueue = new ArrayDeque<>();
	myDequeQueue.add("Jupiter");
	myDequeQueue.add("Mars");
	myDequeQueue.add("Saturn");
	myDequeQueue.add("null");
	for(String s: myQueue) {
		myQueue.poll();
		System.out.println(s);
	}
	for(String s:myDequeQueue) {
		myDequeQueue.poll();
		System.out.println(s);
	}
	System.out.println(myDequeQueue);
	
	Queue<String> myPriority = new PriorityQueue<>(); //value order not insertion order
	myPriority.addAll(myDequeQueue);
	System.out.println(myPriority);
	}

}
