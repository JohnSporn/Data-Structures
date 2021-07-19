package queueInterface;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LLQueue<String> queue = new LLQueue<String>();
		
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("22");
		queue.dequeue();
		queue.enqueue("27");
		queue.dequeue();
		queue.enqueue("60");
		queue.enqueue("62");
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.toString());
		
		if(queue.isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println("Queue is not empty");
		}
		
		if(queue.isFull()) {
			System.out.println("Queue is full");
		}
		else {
			System.out.println("Queue is not full");
		}
	}


	}


