package com.brett.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Brett on 3/1/17.
 */
public class LinkedListPractice {
	public static void main(String[] args) {
		LinkedList<String> strings = new LinkedList<>();
		strings.add("Hello");
		strings.add("These");
		strings.add("Are");
		strings.add("Some");
		strings.add("Strings");

		strings.forEach(System.out::println);

		Iterator<String> descending = strings.descendingIterator();

		descending.forEachRemaining(System.out::println);

		System.out.println();

		LinkedList<Integer> ints = new LinkedList<>();
		ints.add(1);
		ints.add(2);
		ints.add(4);

		ints.forEach(System.out::print);
		System.out.println();

		int index = ints.indexOf(2);
		System.out.println(index);
		ints.add(index + 1, 3);
//		System.out.println(number);
		ints.forEach(System.out::print);


		//Implementation of LinkedList taken from Crunchify, copied with minor changes for educational purposes

		LinkedListImplementation myList = new LinkedListImplementation();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		System.out.println(myList);
		System.out.println(myList.size());
		System.out.println(myList.get(3));
		System.out.println(myList.remove(2));
		System.out.println(myList.get(3));
		System.out.println(myList.size());
		System.out.println(myList);

	}


//	public LinkedList addAtIndex(LinkedList list, int index) {
//
//	}
}
