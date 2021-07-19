package queueInterface;

import nodes.LLNode;

public class LLQueue<E> implements QueueInterface<E> {
	
	private LLNode<E> front, rear;
	private int size;
	
	public LLQueue() {
		
		this.front = null;
		this.rear = null;
		this.size = 0;
		
	}
	
	public void enqueue(E element) {
		
		LLNode<E> newNode = new LLNode<E>(element);
		
		if(isEmpty()) {
			front = newNode;
		}
		else {
			rear.setNext(newNode);	
		}
		rear = newNode;
		size++;
	}
	
	public E dequeue() {
		
		E value = front.getInfo();
		front = front.getNext();
		size--;
		
		return value;
		
	}
	
	public boolean isEmpty() {
		
		return size == 0;
		
	}
	
	public boolean isFull() {
		
		return size == 6;
		
	}
	
	public String toString() {
		
		String queue = "";
		
		LLNode<E> current = front;
		
		while(current != null) {
			queue = queue + current.getInfo() + " ";
			current = current.getNext();
			
		}
		
		return queue;
		
	}

}
