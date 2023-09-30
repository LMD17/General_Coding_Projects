//LinkedStack class implements Stack interface using a LinkedList
//ADVANTAGE: no capacity limit
package Stacks;

import java.util.LinkedList;

public class LinkedStack<E> implements Stack<E> {

    private LinkedList<E> list = new LinkedList<>();    //an empty list
    public LinkedStack(){};     //new stack relies on an initially empty list

    @Override
    public int size() {return list.size();}

    @Override
    public boolean isEmpty() {return list.isEmpty();}

    @Override
    public void push(E element) {list.addFirst(element);}

    @Override
    public E top() {return list.peekFirst();}

    @Override
    public E pop() {
        if (list.isEmpty()) return null;
        return list.removeFirst();}
}
