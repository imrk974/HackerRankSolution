package com.RandomInterview.Test;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void push(int data) {
		q1.add(data);
		
	}
	
	public int pop() {
		
		while (!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		if (q2.isEmpty()) {
			return 1;
		}
		return q2.remove();
	}
	
	
	public static void main(String[] args) {
		StackUsingQueue sq = new StackUsingQueue();
		sq.push(1);
		sq.push(2);
		sq.push(3);
		sq.push(4);
		System.out.println(sq.pop());
	}

}
