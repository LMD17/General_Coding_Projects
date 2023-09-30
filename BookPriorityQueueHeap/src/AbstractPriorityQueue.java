//An abstract base class to assist implementations of the PriorityQueue interface

import java.util.Comparator;

public abstract class AbstractPriorityQueue<K, V> implements PriorityQueue<K, V> {

    //------------------nested PQEntry class----------------------
    //nested PQEntry class that implements the public Entry interface.
    protected static class PQEntry<K, V> implements Entry<K, V> {

        private K k;    //key
        private V v;    //value

        public PQEntry(K key, V value) {
            k = key;
            v = value;
        }

        //Methods for Entry interface
        @Override
        public K getKey() {return k;}

        @Override
        public V getValue() {return v;}

        //utilities not exposed as part of the Entry interface
        protected void setKey(K key){k = key;}
        protected void setValue(V value){v = value;}
    }    //------------------END of nested PQEntry class----------------------

    //instance variable for an AbstractPriorityQueue
    //The comparator defining the ordering of keys in the priority queue
    private Comparator<K> comp;
    protected AbstractPriorityQueue(Comparator<K> c) {comp = c;}

}
