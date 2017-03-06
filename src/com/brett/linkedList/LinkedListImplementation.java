package com.brett.linkedList;

/**
 * Created by Brett on 3/6/17.
 */
public class LinkedListImplementation {

	//Implementation of LinkedList taken from Crunchify, copied with minor changes for personal education


	int counter;
	Node head;

	public LinkedListImplementation() {

	}

	public void add(Object data) {

		if (head == null) {
			head = new Node(data);
		}

		Node temp = new Node(data);
		Node current = head;

		if(current != null) {

			while(current.getNext() != null) {
				current = current.getNext();
			}

			current.setNext(temp);

		}

		incrementCounter();

	}

	public int getCounter() {
		return counter;
	}

	public int incrementCounter() {
		return counter++;
	}

	public int decrementCounter() {
		return counter--;
	}

	//Adds node at specified index
	public void add(Object data, int index) {
		Node temp = new Node(data);
		Node current = head;

		if(current != null) {
			for (int count = 0; count < index && current.getNext() != null; count++) {
				current = current.getNext();
			}
		}

		temp.setNext(current.getNext());
		current.setNext(temp);
		incrementCounter();

	}

	public Object get(int index) {

		if(index < 0) {
			return null;
		}

		Node current = null;

		if (head != null) {
			current = head.getNext();

			for (int count = 0; count < index; count++) {
				if(current.getNext() == null) {
					return null;
				}
				current = current.getNext();
			}
			return current.getData();
		}
		return current;
	}

	public boolean remove(int index) {
		if(index < 1 || index > size()) {
			return false;
		}

		Node current = head;
		if(head != null) {
			for (int count = 0; count < index; count++) {
				if(current.getNext() == null) {
					return false;
				}
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
			decrementCounter();
			return true;
		}
		return false;
	}

	public int size() {
		return getCounter();
	}

//	public String toString() {
//
//	}

	private class Node {
		Node next;

		Object data;

		public Node(Object value) {
			next = null;
			data = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}
	}


}
