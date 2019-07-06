import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
	

public class shoppingList3 {
	
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
			

			boolean valid = true;
			String enterItem = "";
			double price = 0.0; 
			
		do {
			
			// Menu item for user to see before selecting
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
						itemValid = false;

					} else {
						System.out.println("Sorry we don't exist.");
						continue;

					}

					System.out.println("How many do you want to order?");
					int enterQuan = scnr.nextInt();
					 price = enterQuan*keepTrack.get(enterItem);   

					scnr.nextLine();
					valid = false;

				}

				System.out.println("Do you want to order anything else?");
				String yesNo = scnr.nextLine();

				if (yesNo.equalsIgnoreCase("n"))// {
					valid = false;
				// } else
				// continue;
			

			} while (valid);
			

		// I know that this works since the price and quanity is correct...
			System.out.println(price);
			System.out.println(keepTrack.get(enterItem));

					
					for (Map.Entry<String, Double> priceLists : keepTrack.entrySet()) {
				System.out.println("Key: " + ((Entry<String, Double>) keepTrack).getKey() + " "
						+ ((Entry<String, Double>) keepTrack).getValue());
					}

		// Method for Average Cost

			// getAverageCost(the prices of items);
			// System.out.println(getAverageCost(items));
					

			scnr.close();

		}

		public static double getAverageCost(double aver) {
			// (number1 + number2) / 2.0;

			return aver;

		}

	/*
	 * public static int gethighestLowest(int highLow) {
	 * 
	 * for (int i = 0; i < price.length; i++) { if (price[i] > max) max = pric[i];
	 * if (price[i] < min) min = price[i]; }
	 * System.out.println("Maxium Number of the Array is: " + max);
	 * System.out.println("Mininum Number of the Array is " + min);
	 * 
	 * return highLow;
	 * 
	 * }
	 */

		public static int lowest(int low) {

			return low;

		}

	}




