package play;

import java.util.ArrayList;

import foodlist.FoodListInterface;

public class ArrayListFoodList implements FoodListInterface {
	
	private ArrayList<String> foodList;
	
	
	public ArrayListFoodList() {
		
		this.foodList = new ArrayList<String>();
		
	}
	
	@Override
	public void add(String food) {
		
		foodList.add(food);
		
	}
	
	@Override
	public boolean onTheMenu(String food) {
		
		for(int i = 0; i < foodList.size(); i++) {
			
			if(foodList.contains(food)){
				
				return true;
			}
			
		}
		
		return false;
		
	}
	
	public String toString() {
		
		String results = "";
		
		for(int i = 0; i < foodList.size(); i++) {
			results += " " + foodList.get(i);
			
		}
		
		return results;
		
	}

	
}
