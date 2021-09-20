/**
Write a generic method called minimum that accepts four items and find the minium of them.

Test your class with Integer, Double, Character, String, and Car objects.
*/

public interface Minimum<T> {
    public static <T> void minimum(T[] array) {
        T min = array[0];

        for(T element: array) {
            if(element < min) {
                min = element;
            }
        }
    }
}