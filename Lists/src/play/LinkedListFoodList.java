package play;

import foodlist.FoodListInterface;
import foodlist.LLStringNode;


public class LinkedListFoodList implements FoodListInterface {

	LLStringNode foodList;		// reference to head of linked list
	
	@Override
	public void add(String food) {
		// TODO Auto-generated method stub
		
		LLStringNode newNode = new LLStringNode(food);
		newNode.setNext(foodList);
		foodList = newNode;

	}

	@Override
	public boolean onTheMenu(String food) {
		// TODO Auto-generated method stub
		
		LLStringNode current = foodList;
		while(current != null) {
			if(current.getInfo().equalsIgnoreCase(food)) {
				return true;
			}
			else {
				current = current.getNext();
			}
		}
		return false;
	}
	
	public String toString() {
		String listStr = "";
		LLStringNode current = foodList;
		
		while(current != null) {
			listStr = listStr + current.getInfo() + " ";
			current = current.getNext();
		}
		
		return listStr;
	}

}
