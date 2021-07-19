package stackInterface;

import nodes.LLNode;

public class LLStack<E> implements StackInterface<E> {
	
	private LLNode<E> head;
	private int size;
	
		public LLStack() {
			
			this.head = null;
			this.size = 0;
			
		}
		
		public void push(E element) {
			
			LLNode<E> newNode = new LLNode<E>(element);
			newNode.setNext(head);
			head = newNode;
			size++;
			
		}
		
		public E pop() {
			
			E value = head.getInfo();
			head = head.getNext();
			size--;
			
			return value;
			
		}
		
		public E peek() {
			
			return head.getInfo();
			
		}
		
		public boolean isEmpty() {
			
			return size == 0;
			
		}
		
		@Override
		public boolean isFull() {
			
			return size == 4;
			
		}
		
		public String toString() {
			
			String stack = "";
			
			LLNode<E> current = head;
			
			while(current != null) {
				stack = stack + current.getInfo() + " ";
				current = current.getNext();
				
			}
			
			return stack;
			
		}

}
