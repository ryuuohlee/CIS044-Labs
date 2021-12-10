import java.util.Queue;
import java.util.ArrayDeque;

public final class OurQueue<T> implements QueueInterface<T>
{
    private ArrayDeque<T> line;
    private static final int DEFAULT_CAPACITY = 25;
    private static final int MAX_CAPACITY = 50;
    private boolean orderOK;

    public OurQueue()
    {
        this(DEFAULT_CAPACITY);
    } // end default constructor
    
    public OurQueue(int initialCapacity)
    {
        line = new ArrayDeque<>(initialCapacity);
    } //end constructor

    public void enqueue(T newEntry)
    {
        line.addLast(newEntry);
    }

    

}