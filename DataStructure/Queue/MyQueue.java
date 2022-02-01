package com.queue;

public class MyQueue {
	private Node front;
	private Node rear;
	private int size = 0;

	private void enQueue(int data) {
		Node new_node = new Node(data);
		if (isEmpty()) {
			front = new_node;
			rear = new_node;
		} else {
			rear.setNext(new_node);
			rear = new_node;
		}
		size++;

	}

	private int deQueue() {
		if (isEmpty()) {
			System.out.print("Stack Underflow ");
			return -1;
		}

		int data = front.getData();
		front = front.getNext();
		if (front == null) {
			rear = null;
		}
		size--;
		return data;
	}

	private int peek() {
		if (isEmpty()) {
			System.out.print("No item ");
			return -1;
		}
		return front.getData();
	}

	private boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	private int size() {
		return size;
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "Queue is empty";
		}
		String str = "[";
		Node temp = front;
		while (temp.getNext() != null) {
			str += temp.getData();
			str += ", ";
			temp = temp.getNext();
		}
		str += temp.getData();
		return str + "]";
	}

	public static void main(String[] args) {
		MyQueue mq = new MyQueue();

		mq.enQueue(0);
		mq.enQueue(1);
		mq.enQueue(2);
		mq.enQueue(3);
		mq.enQueue(4);
		mq.enQueue(5);
		System.out.println(mq);
		System.out.println(mq.peek());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.size());
		System.out.println(mq);

	}

}
