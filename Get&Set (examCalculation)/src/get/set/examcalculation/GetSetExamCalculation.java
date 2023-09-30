package get.set.examcalculation;

public class GetSetExamCalculation {

    public static void main(String[] args) {

        DP dueP = new DP();

        System.out.println("Default Constructor: ");
        System.out.println("StudetnNumber: " + dueP.getStudentName());
        System.out.println("Name: " + dueP.getStudentName());
        System.out.println("Module Code: " + dueP.getStudentModuleCode());
        System.out.println("DP: " + dueP.getDP());

        System.out.println(" ");

        DP dp = new DP("12d56", "John", "1234", 20);

        System.out.println("Overloaded constructor: ");
        System.out.println("Default Constructor: ");
        System.out.println("StudetnNumber: " + dp.getStudentName());
        System.out.println("Name: " + dp.getStudentName());
        System.out.println("Module Code: " + dp.getStudentModuleCode());
        System.out.println("DP: " + dp.getDP());
    }
}
