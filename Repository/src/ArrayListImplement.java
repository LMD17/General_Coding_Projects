
//Imports
import java.util.ArrayList;
import java.util.Collection;

public class ArrayListImplement {

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
        ArrayList<String> studentCopy = (ArrayList<String>) studentNames.clone();
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
    }
}
