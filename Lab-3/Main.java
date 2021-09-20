
public class Main {

	public static void main(String[] args) {
		BagInterface<String> b1 = new ArrayBag<>();
		BagInterface<String> thingsToBuy = new ArrayBag<>();
		b1.add("apple");
		b1.add("orange");
		b1.add("pear");
		String item = "lemon";
		String newItem = "honey";
		if (b1.contains(item))
			System.out.println("We already have " + item);
		else
		{
			System.out.println("Buy " + item);
			thingsToBuy.add(item);
		}
		
		item = "apple";
		if (b1.contains(item))
			System.out.println("We already have " + item);
		else
		{
			System.out.println("Buy " + item);
			thingsToBuy.add(item);
		}
		
		item = "milk";
		if (b1.contains(item))
			System.out.println("We already have " + item);
		else
		{
			System.out.println("Buy " + item);
			thingsToBuy.add(item);
		}
		
		
		System.out.println("Buy the following items: " );
		thingsToBuy.display();
		
		item = "apple";
		b1.replace(item, newItem);
		System.out.println("We replaced " + item + " with " + newItem);

	}

}
