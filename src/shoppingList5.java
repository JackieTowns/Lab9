import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
	

public class shoppingList5 {
	
		public static void main(String[] args) {

			ArrayList<String> items = new ArrayList<>();
			items.add("apple");
			items.add("banana");
			items.add("cauliflower");
			items.add("dragonfruit");
			items.add("Elderberry");
			items.add("figs");
			items.add("grapefruit");
			items.add("honeydew");

			ArrayList<Double> prices = new ArrayList<>();

			prices.add(0.99);
			prices.add(0.59);
			prices.add(1.59);
			prices.add(2.19);
			prices.add(1.79);
			prices.add(2.09);
			prices.add(1.99);
			prices.add(3.49);

			Scanner scnr = new Scanner(System.in);


			Map<String, Double> keepTrack = new HashMap<>();
			keepTrack.put("apple", 0.99);
			keepTrack.put("banana", 0.59);
			keepTrack.put("cauliflower", 1.59);
			keepTrack.put("dragonfruit", 2.19);
			keepTrack.put("Elderberry", 1.79);
			keepTrack.put("figs", 2.09);
			keepTrack.put("grapefruit", 1.99);
			keepTrack.put("honeydew", 3.49);
			


		String enterItem = "";
		double price = 0.0;
		int quantity = 0;
		String userInput;

		ArrayList<String> itemsOrdered = new ArrayList<>();
		ArrayList<Double> pricesOrdered = new ArrayList<>();
			
		do {
			
			System.out.println("Welcome to this Market!");
			System.out.println();
			System.out.println("Item    " + "Price    ");
			System.out.println("=======================");
			System.out.println("apple    " + "0.99");
			System.out.println("banana    " + "0.59");
			System.out.println("cauliflower    " + "1.59");
			System.out.println("dragonfruit    " + "2.19");
			System.out.println("Elderberry    " + "1.79");
			System.out.println("figs    " + "2.09");
			System.out.println("grapefruit    " + "1.99");
			System.out.println("honeydew    " + "3.49");
			
			System.out.println();
			
			
				boolean itemValid = true;
				while (itemValid) {

				System.out.println("Please enter an item name: ");

				enterItem = scnr.nextLine();


					if (keepTrack.containsKey(enterItem)) {
						System.out.println(keepTrack.get(enterItem));
					itemsOrdered.add(enterItem);
					pricesOrdered.add(keepTrack.get(enterItem));
						itemValid = false;

					} else {
						System.out.println("Sorry we don't exist.");
						continue;

					}

					System.out.println("How many do you want to order?");
				int enterQuan = scnr.nextInt();
				quantity = quantity + enterQuan;
				price = price + enterQuan * keepTrack.get(enterItem);
					scnr.nextLine();

				}

			System.out.println("Do you want to order anything else?(y/n)");
			userInput = scnr.nextLine();

			if (userInput.equalsIgnoreCase("n")) {
				break;
			}

		} while (userInput.equalsIgnoreCase("y"));


		System.out.println("You ordered:");
		for (int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println(itemsOrdered.get(i));
		}


		System.out.println("Total: " + price);

		System.out.println();

		double min = getMin(pricesOrdered);
		double max = getMax(pricesOrdered);
		double avg = getAverage(pricesOrdered, quantity);

		System.out.println("Lowest cost item: " + min);
		System.out.println("Highest cost item: " + max);
		System.out.println("Average cost item: " + avg);
			scnr.close();

		}

	public static double getAverage(ArrayList<Double> pricesOrdered, int quantity) {

		double getAverage = 0;

		for(double item : pricesOrdered) {
			getAverage = getAverage + item; 
		}
		

		return getAverage/quantity;
	}

	public static double getMin(ArrayList<Double> pricesOrdered) {

		double minPrice = pricesOrdered.get(0);

		for (double item : pricesOrdered) {

			if (item < minPrice) {
				minPrice = item;
		}

		}

		return minPrice;
	}

	public static double getMax(ArrayList<Double> pricesOrdered) {

		double maxPrice = pricesOrdered.get(0);

		for(double item : pricesOrdered) { 
			if (item > maxPrice) {
				maxPrice = item;
			}
		}
		return maxPrice;
	}

}




