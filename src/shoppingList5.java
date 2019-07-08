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
		String userInput;
			
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
						itemValid = false;

					} else {
						System.out.println("Sorry we don't exist.");
						continue;

					}

					System.out.println("How many do you want to order?");
				int enterQuan = scnr.nextInt();
					 price = enterQuan*keepTrack.get(enterItem);   
					scnr.nextLine();

				}

				System.out.println("Do you want to order anything else?");
			userInput = scnr.nextLine();

			if (userInput.equalsIgnoreCase("n")) {
				break;
			}

		} while (userInput.equalsIgnoreCase("y"));

		// Use an empty arrayList to add the items. One for prices and one for items.
		// arrayListname.add(UserInput).
		// arraylistname.add(price)
		// for arraylistname.size(or length) print them out

		ArrayList<String> itemsOrdered = new ArrayList<>();
		ArrayList<Double> pricesOrdered = new ArrayList<>();
		itemsOrdered.add(enterItem);
		pricesOrdered.add(price);

		for (int i = 0; i < itemsOrdered.size(); i++) {
			System.out.println(itemsOrdered.size());
		}


		System.out.println("Total: " + pricesOrdered);
		// getAverageCost();

			scnr.close();

		}

	/*
	 * public static void getAverageCost() { return Total / 2; }
	 * 
	 * public static void getMinMax(double min, double max) { if (pricesOrdered[i] >
	 * max) max = pricesOrdered[i]; if (pricesOrdered[i] < min) min=
	 * pricesOrdered[i];
	 * 
	 * System.out.println("Maxium Number of the Array is: " + max);
	 * System.out.println("Mininum Number of the Array is " + min);
	 * 
	 * }return minMax;
	 */
	}




