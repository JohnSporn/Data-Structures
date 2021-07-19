package stackInterface;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLStack<String> stack = new LLStack<String>();
		
		stack.push("1");
		stack.push("2");
		stack.push("22");
		stack.push("27");
		stack.pop();
		stack.push("60");
		stack.push("62");
		stack.pop();
		stack.peek();
		System.out.println(stack.toString());
		
		System.out.println("Peeked element is " + stack.peek());
		
		if(stack.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
		}
		
		if(stack.isFull()) {
			System.out.println("Stack is full");
		}
		else {
			System.out.println("Stack is not full");
		}
	}

}
