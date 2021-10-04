public class LinkedBagTest {
    public static void main(String[] args) {
        BagInterface<String> myBag = new LinkedBag<>();

        myBag.add("30");
        myBag.add("40");
        myBag.add("50");
        myBag.add("10");
        myBag.add("60");
        myBag.add("20");

        int numberOfEntries = myBag.getCurrentSize();
        Object[] entries = myBag.toArray();

        for (int index = 0; index < numberOfEntries; index++) {
            System.out.print(entries[index] + " ");
        }

        //test isEmpty
        myBag.add("11");
       System.out.printf("\n");
       System.out.println(myBag.isEmpty());

       //test currentSize
       System.out.println(myBag.getCurrentSize());

       //test remove
       myBag.remove();
       Object[] newList = myBag.toArray();
       for (int index = 0; index < numberOfEntries; index++) {
            System.out.print(newList[index] + " ");
        }
    }
}