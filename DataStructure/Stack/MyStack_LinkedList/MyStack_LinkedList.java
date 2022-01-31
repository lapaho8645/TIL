package com.stack;

public class MyStack_LinkedList {
	private Node top = new Node();
	private int size = 0;

	// Removes the object at the top of this stack and returns that object as the value of this function
	private int pop() {
		if (empty()) {
			System.out.print("Stack Underflow ");
			return -1;
		}
		int data = top.getData();
		top = top.getNext();
		size--;
		return data;
	}

	// Pushes an item onto the top of this stack
	private void push(int data) {

		Node new_node = new Node(data);
		new_node.setNext(top);
		top = new_node;
		size++;

	}

	// Looks at the object at the top of this stack without removing it from the stack.
	private int peek() {
		if (empty()) {
			System.out.print("No item ");
			return -1;
		}
		return top.getData();
	}

	// Tests if this stack is empty.
	private boolean empty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	private void clear() {
		if (empty()) {
			System.out.println("clear");
		} else {
			while (top.getNext() != null) {
				pop();
			}
			System.out.println("clear");
		}

	}

	public static void main(String[] args) {
		MyStack_LinkedList MStack = new MyStack_LinkedList();
		MStack.push(0);
		MStack.push(1);
		MStack.push(2);
		MStack.push(3);
		System.out.println(MStack.peek());
		// MStack.clear();
		System.out.println(MStack.pop());
		System.out.println(MStack.pop());
		System.out.println(MStack.pop());
		System.out.println(MStack.pop());
		System.out.println(MStack.pop());

	}

}
