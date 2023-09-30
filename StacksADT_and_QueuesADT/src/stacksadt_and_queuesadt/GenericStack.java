package stacksadt_and_queuesadt;

//GenericStack class
public class GenericStack<E> {
    
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    //get stack size
    private int getSize(){
        return list.size();
    }
    
    //add element to list
    public void push(E e){
        list.add(e);
    } 
    
    //return top element of stack and remove top element
    public E pop(){
        E e = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return e;
    } 
    
    //isEmpty method
    public Boolean isEmpty(){
        return list.isEmpty();
    }
    
    //return top element of stack
    public E peek(){
        return list.get(getSize() - 1);
    }
    
    //return stack as string
    @Override
    public String toString(){
        return list.toString();
    }
}
