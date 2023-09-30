//ArrayStack class implements Stack interface using an array
//DISADVANTAGE: it relies on a fixed-capacity array, which limits the ultimate size of the stack.
package Stacks;

public class ArrayStack<E> implements Stack<E> {

    public static final int CAPACITY = 1000;    //default array capacity
    private E[] data;                           //generic array used for storage
    private int t = -1;                         //index of the top element in the stack
    public ArrayStack(){this(CAPACITY);}        //constructor constructs stack with a default capacity (calling constructor below using 'this' keyword)
    public ArrayStack(int capacity) {           //constructor constructs stack with the given capacity
        data = (E[]) new Object[capacity];      //safe cast
    }
    @Override
    public int size() {return t+1;}

    @Override
    public boolean isEmpty() {return(t == -1);}

    @Override
    public void push(E e) throws IllegalStateException{
        if(size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = e;
    }

    @Override
    public E top() {
        if(isEmpty()) return null;
        return data[t];
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
}
