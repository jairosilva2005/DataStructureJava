package com.jairosilva.queues.tests;

import com.jairosilva.queues.Queue;

public class DequeueMethod {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.toQueue(1);
		queue.toQueue(2);
		queue.toQueue(3);
		queue.toQueue(4);
		queue.toQueue(5);
		System.out.println(queue.toString());
		System.out.println(queue.spy());
		queue.dequeue();
		System.out.println(queue.toString());
		System.out.println(queue.spy());
	}

}
