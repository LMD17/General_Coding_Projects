package stacksadt_and_queuesadt;

public class StacksADT_and_QueuesADT {

    public static void main(String[] args) {

        //Create GenericStack object
        GenericStack<String> stackA = new GenericStack<>();
        GenericStack<String> stackB = new GenericStack<>();

        stackA.push("ITDIA");
        stackA.push("ITCAA");
        stackA.push("ITDBI");
        stackA.push("ITCEA");

        stackB.push("ITDB");
        stackB.push("ITCEA");
        stackB.push("ITNSA");
        stackB.push("ITSKA");
    }





        //Add elemets to stack --> use push method
        stack.push("Ferarri");
        System.out.println("Cars stack" + stack);

        stack.push("Porche");
        System.out.println("Cars stack" + stack);

        stack.push("Bugatti");
        System.out.println("Cars stack" + stack);

        stack.push("Lamborgini");
        System.out.println("Cars stack" + stack);

        //Remove elements from stack --> use pop method
        stack.pop();
        System.out.println("Cars stack" + stack);

        stack.pop();
        System.out.println("Cars stack" + stack);

        stack.pop();
        System.out.println("Cars stack" + stack);

        //Is stack empty?
        System.out.println("Is stack empty: " + stack.isEmpty());

        stack.pop();
        System.out.println("Is stack empty: " + stack.isEmpty());

        /////////////////////////
        //Create GenericSQueue object
        GenericSQueue<String> queue = new GenericSQueue<>();

        //Add elements to the queue --> use enQueue method
        queue.enQueue("Ferarri");
        System.out.println("Cars queue " + queue);

        queue.enQueue("Porche");
        System.out.println("Cars queue " + queue);
        
        queue.enQueue("Bugatti");
        System.out.println("Cars queue " + queue);
        
        queue.enQueue("Lamborgini");
        System.out.println("Cars queue " + queue);
        
        
        //Remove elements from queue --> use deQueue method
        queue.deQueue();
        System.out.println("Cars queue " + queue);
        
        queue.deQueue();
        System.out.println("Cars queue " + queue);
        
        queue.deQueue();
        System.out.println("Cars queue " + queue);
        
        queue.deQueue();
        System.out.println("Cars queue " + queue);
        
        
    }

}
