package get.set.examcalculation;

public class DP {

    String studentNo;
    String studentName;
    String moduleCode;
    int DP;
    int totOfStudents = 0;

    //The constructors
    //Default constructor
    public DP() {
        studentNo = "no number yet";
        studentName = "no name yet";
        moduleCode = "no code provided";
        DP = 0;

        totOfStudents++;
    }
    
    //overloaded constructor
    public DP(String number, String name, String module, int mark) {
        studentNo = number;
        studentName = name;
        moduleCode = module;
        DP = mark;
        totOfStudents++;

    }

    //Defining the setters
    void setStudentDeteils(String number, String name, String module, int mark) {
        studentNo = number;
        studentName = name;
        moduleCode = module;
        DP = mark;
    }

    void setDP(int dueP) {
        if (dueP < 20) {
            System.out.println("You do not qualify");
        } else {
            DP = dueP;
            System.out.println("You qualify!");
        }
    }

    //Defining the getters
    String getStudentNo() {
        return studentNo;
    }

    String getStudentName() {
        return studentName;
    }

    String getStudentModuleCode() {
        return moduleCode;
    }

    int getDP() {
        return DP;
    }
}
