package stacksadt_and_queuesadt;

//GenericSQueue class
class GenericSQueue<E> {

    private java.util.LinkedList<E> list = new java.util.LinkedList<>();

    //Define Queue methods
    
    //get queue size
    public int getSize() {
        return list.size();
    }

    //Add element to queue
    public void enQueue(E e) {
        list.add(e);
    }

    //Remove first element
    public void deQueue() {
        list.removeFirst();
    }

    @Override
    public String toString(){
        return "The queue contains: " + list.toString();
    }
}
