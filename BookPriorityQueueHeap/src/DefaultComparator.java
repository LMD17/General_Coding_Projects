import java.util.Comparator;

//Default comparator class that implements a comparator based upon the natural ordering of elements
public class DefaultComparator<E> implements Comparator<E> {

    @Override
    public int compare(E a, E b) throws ClassCastException {
        return ((Comparable<E>)a).compareTo(b);
    }
}
