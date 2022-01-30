package com.LinkedList;

public class MyLinkedList {

	private Node head = new Node();
	private Node tail;
	private int size = 0;

	// Appends the specified element to the end of this list.
	private void add(int data) {
		if (size == 0) {
			Node new_node = new Node(data);
			head.next = new_node;
			tail = new_node;
			size++;
			return;
		}
		Node new_node = new Node(data);
		tail.next = new_node;
		tail = new_node;
		size++;
	}

	// Inserts the specified element at the specified position in this list.
	private void add(int index, int data) {
		if (index == 0) {
			addFirst(data);
			return;
		}
		Node new_node = new Node(data);
		Node pre_node = node(index - 1);
		new_node.next = pre_node.next;
		pre_node.next = new_node;
		size++;
	}

	// Inserts the specified element at the beginning of this list.
	private void addFirst(int data) {
		Node new_node = new Node(data);
		new_node.next = head.next;
		head.next = new_node;
		size++;
	}

	private Node node(int index) {
		Node search = head;
		for (int i = 0; i <= index; i++) {
			search = search.next;
		}
		return search;
	}

	// returns the element at the specified position in this list.
	private int get(int index) {
		return node(index).data;
	}

	// Removes the element at the specified position in this list.
	private void remove(int index) {
		Node pre_node = node(index - 1);
		Node cur_node = node(index);
		Node next_node;
		if (index == size - 1) {
			tail = pre_node;
			pre_node = node(index - 1);
			pre_node.next = null;
			size--;
			return;
		}
		next_node = node(index + 1);
		pre_node.next = next_node;
		cur_node = null;
		size--;
	}

	// Replaces the element at the specified position in this list with the specified elements.
	private void set(int index, int data) {
		node(index).data = data;
	}

	// Removes all of the elements from this list.
	private void clear() {
		int curSize = size();
		for (int i = 0; i < curSize; i++) {
			remove(0);
		}
	}

	// returns the number of elements in this list.
	private int size() {
		return size;
	}

	@Override
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		String str = "[";
		Node search = head.next;
		while (search.next != null) {
			str += search.data + ", ";
			search = search.next;
		}
		str += search.data + "]";
		return str;
	}

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		list.add(1, 5);
		System.out.println(list);
		list.addFirst(6);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.set(3, 9);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.size());
		list.clear();
		System.out.println(list);
		
	}
}
