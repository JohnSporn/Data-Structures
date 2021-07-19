package play;

public class TestFoodList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Now testing linked list food list:");
		
		LinkedListFoodList fav1 = new LinkedListFoodList();
		
		fav1.add("Chocolate ice cream");
		fav1.add("Baked ziti");
		fav1.add("Filet Mignon");
		fav1.add("French Fries");
		fav1.add("Grilled Chicken");
		fav1.add("Scrambled eggs");
		fav1.add("Pork chops");
		
		System.out.println("My favorite foods are ");
		System.out.println(fav1);
		
		if(fav1.onTheMenu("Baked ziti")) {
			System.out.println("Baked ziti is a favorite");
		}
		else {
			System.out.println("Baked ziti is not on the list");
		}
		
		System.out.println(fav1.onTheMenu("Fettuccine alfredo") ?
				"Fettuccine alfredo is on the list" :
					"Fettuccine alfredo is not on the list"); 
		
System.out.println("\n");		
System.out.println("Now testing the array food list:");
		
		ArrayFoodList list  = new ArrayFoodList();
		
		list.add("Chocolate ice cream");
		list.add("Baked ziti");
		list.add("Filet mignon");
		list.add("French fries");
		list.add("Grilled chicken");
		list.add("Scrambled eggs");
		list.add("Pork chops");
		
		System.out.println("My favorite foods are ");
		System.out.println(list);
		
		if(list.onTheMenu("Baked ziti")) {
			System.out.println("Baked ziti is a favorite.");
		}
		else {
			System.out.println("Baked ziti is not on the list");
		}
		
		System.out.println(list.onTheMenu("Fettuccine alfredo") ?
				"Fettuccine alfredo is on the list" :
					"Fettuccine alfredo is not on the list"); 

System.out.println("\n");		
System.out.println("Now testing array list food list:");
		
		ArrayListFoodList fav = new ArrayListFoodList();
		
		fav.add("Chocolate ice cream");
		fav.add("Baked ziti");
		fav.add("Filet mignon");
		fav.add("French fries");
		fav.add("Grilled chicken");
		fav.add("Scrambled eggs");
		fav.add("Pork chops");
		
		System.out.println("My favorite foods are ");
		System.out.println(fav);
		
		if(fav.onTheMenu("Baked ziti")) {
			System.out.println("Baked ziti is a favorite.");
		}
		else {
			System.out.println("Baked ziti is not on the list.");
		}
		
		System.out.println(fav.onTheMenu("Fettuccine alfredo") ?
				"Fettuccine alfredo is on the list." :
					"Fettuccine alfredo is not on the list."); 


	}

}
