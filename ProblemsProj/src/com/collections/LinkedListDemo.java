package com.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	/* LinkedList 
	 * it is same like array 
	 * it has double linked list as the internal data structure
	 * its default size is 0 increases by double 
	 * here data is stored in the form of nodes
	 * each node maintains the link of previous and next node
	 * it is good for update operations not good for select operations
	 * */
public static void main(String[] args) {
	List<Student> ll=new LinkedList<Student>();
	ll.add(new Student(1, "ramya", "sangam"));
	ll.add(new Student(7, "janu", "east blue"));
	ll.add(new Student(9, "dinu", "marine"));
	ll.add(new Student(3, "luffffy", "wano"));
	ll.add(new Student(4, "zoro", "punk hazard"));
	
	
//	System.out.println(ll);
	ListIterator<Student> li=ll.listIterator();
	while(li.hasNext())
		System.out.println(li.next()+" ");
	System.out.println("--------------------------------------------------");
//	Collections.sort((List<Student>) ll);
	while(li.hasPrevious())
		System.out.println(li.previous()+" ");

}
}
