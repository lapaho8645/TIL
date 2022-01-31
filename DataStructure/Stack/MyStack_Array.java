package com.stack;

public class MyStack_Array {
	private int top = -1;
	private int stackSize;
	private int stack[];

	public MyStack_Array(int size) {
		setStackSize(size);
	}

	public void setStackSize(int stackSize) {
		if (stackSize > 0) {
			this.stackSize = stackSize;
			stack = new int[stackSize];
		} else {
			System.out.println("0보다 큰 수를 입력해주세요.");
		}
	}

	private int pop() {
		if(isEmpty()) {
			System.out.print("Stack Underflow ");
			return -1;
		}
		return stack[top--];
		
	}

	private void push(int data) {
		if (!isFull()) {
			stack[++top] = data;
		} else {
			System.out.println("Stack Overflow ");
		}
	}

	private int peek() {
		if(!isEmpty()) {
			return stack[top];
		}else {
			System.out.print("No item ");
			return -1;
		}
	}

	private boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isFull() {
		if (top == stackSize - 1) {
			return true;
		} else {
			return false;
		}
	}
	private void clear() {
		if(isEmpty()) {
			System.out.println("clear");
		}else {
			int size = top;
			for(int i = 0; i <= size;i++) {
				pop();
			}
			
			System.out.println("clear");
		}
	}
	public static void main(String[] args) {
		MyStack_Array MStack = new MyStack_Array(10);
		MStack.push(0);
		MStack.push(1);
		MStack.push(2);
		MStack.push(3);
		System.out.println(MStack.peek());
		//MStack.clear();
		System.out.println(MStack.pop());
		System.out.println(MStack.pop());
		System.out.println(MStack.pop());
		System.out.println(MStack.pop());
		System.out.println(MStack.pop());
	}

}
