package Stacks;

//Stack interface is a collection of objects that are
//inserted and removed according to LIFO (Last-in first-out) principle.

public interface Stack<E> {

    //Returns the number of elements in the stack
    int size();

    //Tests whether the stack is empty
    boolean isEmpty();

    //Inserts an element at the top of the stack
    void push(E e);

    //Returns, but does not remove, the element at the top of the stack.
    E top();

    //Removes and returns the element at the top of the stack
    E pop();


}
