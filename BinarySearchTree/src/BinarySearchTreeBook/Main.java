package BinarySearchTreeBook;

import net.datastructures.Entry;
import net.datastructures.Position;

public class Main {
    public static void main(String[] args) {

        TreeMap<Integer,Integer> bstTree = new TreeMap<>();
        bstTree.get(16);

    }
}


    private Integer treeSearch(Position<Entry<K,V>> p, K key) {
        if (isExternal(p))
            return p;                          // key not found; return the final leaf
        int comp = compare(key, p.getElement());
        if (comp == 0)
            return p;                          // key found; return its position
        else if (comp < 0)
            return treeSearch(left(p), key);   // search left subtree
        else
            return treeSearch(right(p), key);  // search right subtree
    }


    /**
     * Returns the position in p's subtree having the given key (or else the terminal leaf).
     * @param key  a target key
     * @param p  a position of the tree serving as root of a subtree
     * @return Position holding key, or last node reached during search
     */
    private Position<net.datastructures.Entry<K,V>> treeSearch(Position<net.datastructures.Entry<K,V>> p, K key) {
        if (isExternal(p))
            return p;                          // key not found; return the final leaf
        int comp = compare(key, p.getElement());
        if (comp == 0)
            return p;                          // key found; return its position
        else if (comp < 0)
            return treeSearch(left(p), key);   // search left subtree
        else
            return treeSearch(right(p), key);  // search right subtree
    }