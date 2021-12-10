/* Merge sort */
public static <T extends Comparable<? super T>>
    void mergeSort(T[] a, int n)
{
    mergeSort(a, 0, n - 1);
}

public static <T extends Comparable<? super T>>
    void mergeSort(T[] a, int first, int last)
{
    @SuppressWarnings("unchecked")
    T[] tempArray = (T[]) new Comparable<?>[a.length];
    mergeSort(a, tempArray, first, last);
}

    private static <T extends Comparable<? super T>>
        void mergeSort(T[]a, T[] tempArray, int first, int last)
    {
        if (first < last)
        {
            int mid = first + (last - first) / 2;
            mergeSort(a, first , mid);
            mergeSort(a, mid + 1, last);

                if (a[mid].compareTo(a[mid + 1]) > 0)
                {
                    merge(a, tempArray, first, mid, last);
                }
        }
    }

    private static <T extends Comparable<? super T>>
        void merge(T[] a, T[] tempArray, int first, int last)
    {
        int beginHalf1 = first;
        int endHalf1 = mid;
        int beginHalf2 = mid + 1;
        int endHalf2 = last;

        int index = beginHalf1;
        for (; (beginHalf1 <= endHalf1) && (beginHalf2 <= endHalf2); index++)
        {
            
        }
    }