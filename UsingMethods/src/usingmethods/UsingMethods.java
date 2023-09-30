package usingmethods;

import java.util.*;

public class UsingMethods {

    public static void main(String[] args) {
        //Create ArrayList object
        ArrayList<String> studentNames = new ArrayList<>();

        //Add elements to the ArrayList
        studentNames.add("Becks");
        studentNames.add("Luke");
        studentNames.add("Jay");
        studentNames.add("Ross");
        studentNames.add("Vrikie");

        //Print ArrayList studentNames
        System.out.println("This is the contents of the ArrayList studentNames: " + studentNames);

        //contains method
        System.out.println("Is Becks in the list: " + studentNames.contains("Becks"));

        //remove method
        studentNames.remove("Vrikie");
        System.out.println("Remove Vrikie from the list: " + studentNames);

        //clone Method
        ArrayList<String> studentCopy = (ArrayList<String>) (studentNames.clone());
        System.out.println("StudentCopy ArrayList: " + studentCopy);

        Collection<String> studentNames2 = new ArrayList<>();
        studentNames2.add("Mom");
        studentNames2.add("Dad");
        studentNames2.add("Natalie");
        studentNames2.add("Michael");
        studentNames2.add("Tyrone");
        studentNames2.add("Seth");
        System.out.println("StudentNames2 ArrayList: " + studentNames2);

        //addAll method
        studentCopy.addAll(studentNames2);
        System.out.println("StudentNames2 added to studentCopy ArrayList: " + studentCopy);

        //removeAll method
        System.out.println("StudentCopy ArrayList remove studentNames2: " + studentCopy.removeAll(studentNames2));
        System.out.println("StudentCopy ArrayList: " + studentCopy);

        //Cars collection
        Collection<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Jeep");
        cars.add("BMW");
        cars.add("Audi");

        //Create Iterator --> can also use the for each loop
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(24);
        numbers.add(25);
        numbers.add(26);
        numbers.add(27);
        numbers.add(0, 10);
        numbers.add(3, 30);

        System.out.println("The elements of the numbers ArrayList are: " + numbers);

        //create new LinkedList and put ArrayList numbers in the new LinkedList
        LinkedList<Object> linkedList = new LinkedList<>(numbers);
        linkedList.add(1, "orange");
        linkedList.removeLast();
        linkedList.addFirst("banana");

        //iterating through linkedList
        System.out.println("Showing how to transverse backward and forward");

        System.out.println("hasNext:");
        ListIterator<Object> listerator = linkedList.listIterator();    //create Listiterator object
        while (listerator.hasNext()) {
            System.out.println(listerator.next());
        }
        
        System.out.println("hasPrevious:");
        while (listerator.hasPrevious()) {
            System.out.println(listerator.previous());
        }
        
        System.out.println("\n\n\n");
        
        ////////////////////////////////////////////////////////////////////////
        //FOR EACH
        Collection<String> students = new ArrayList<>();
        students.add("Becks");
        students.add("Luke");
        students.add("Mary");
        students.add("John");
        students.add("Ryan");
        students.add("Brandon");
        
        //For Each using method and lambda expression (For Each is found in the Iterator interface!!!)
        students.forEach(e -> System.out.println(e.toLowerCase()));
        
        //For Each using For Each Loop
        System.out.println("Student names using For Each");
        for (String student : students) {
            System.out.println(student);
        }
    }

}
