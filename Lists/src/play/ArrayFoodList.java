package play;

import foodlist.FoodListInterface;
import foodlist.LLStringNode;

public class ArrayFoodList implements FoodListInterface {
			
		private String foodlist[];
		private int size;
		
		public ArrayFoodList() {
			
			this.foodlist = new String[7]; 
			this.size = 0;
			
	}
	
		@Override
		public void add(String food) {
			
			
			foodlist[size] = food;
			size++;
			
		}
		
		@Override
		public boolean onTheMenu(String food) {
			
			for(int i = 0; i < size; i++) {
				
				if(foodlist[i].equalsIgnoreCase(food)){	
					return true;
					
				}
					
			}
			
			return false;
			
	}
		
		public String toString() {
			
			String listStr = "";
			
			for(int i = 0; i < size; i++) {
				listStr = listStr + foodlist[i];
				if(i != size - 1) {
					listStr = listStr + " ";
				}
				
			}
			
			return listStr;
		}
		
}

