package com.RandomInterview.Test;

import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void enqueue(int data) {
		stack1.push(data);
	}

	public int dequeue() {

		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		if(stack2.isEmpty()) {
			return -1;
		}
		return stack2.pop();
	}

	public static void main(String[] args) {
		QueueUsingStack queue = new QueueUsingStack();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

	}

}
