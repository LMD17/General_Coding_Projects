package tree_interfaces;

import java.util.Collection;

public interface Tree_Interface<E> extends Collection<E> {

    //return true if element is successfully found
    public boolean search(E e);

    //return true if element is successfully deleted
    public boolean insert(E e);

    //return true if element is successfully inserted
    public boolean delete(E e);

    //returns size of tree
    public int getSize();

    //transverses from the root
    public default void inorder() {

    }

    //transverses from the root
    public default void preorder() {

    }

    //transverses from the root
    public default void postorder() {

    }

    @Override
    public default boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public default boolean add(E e){
        return insert(e);
    }

    @Override
    public default boolean remove(Object e){
        return delete((E)e);
    }
    @Override
    public default int size() {
        return getSize();
    }

    public default Object[] toArray(){
        return null; //I dont think that ma' am is right
    }

    //I dont know what ma' am is doing...
    public default boolean retainAll(Collection<?> c){
        return false;
    }

    //I dont know what ma' am is doing...
    public default boolean removeAll(Collection<?> c){
        return false;
    }
}
