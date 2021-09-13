/*
Items Test

Test your generics on the Items class
*/

public class ItemsTest {
    public static void main(String[] args) {

        Items apple = new Items("Apple", 0.75, 2);
        Items candle = new Items("Candle", 0.50, 3);
        Items steak = new Items("Steak", 20.50, 1);
        Items cake = new Items("Cake", 34.00, 1);
        Items soda = new Items("Coke", 2.50, 1); 

        Items[] arrayItem = new Items[5];

        arrayItem[0] = apple;
        arrayItem[1] = candle;
        arrayItem[2] = steak;
        arrayItem[3] = cake;
        arrayItem[4] = soda;

        System.out.printf("%s $%.2f", "Total Cost of items is", totalCost(arrayItem));
    }

    public static double totalCost(Items[] array) {
        double total = 0.00;

        for(int i = 0; i < array.length; i++) {
            if(array[i].quantity > 1) {
                total += (array[i].quantity * array[i].price);
            }
            total += array[i].price;
        }

        return total;
    }

}