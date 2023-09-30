import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mark=0;
        int credit=0;
        ArrayList<Integer> marks = new ArrayList<>();
        ArrayList<Integer> credits = new ArrayList<>();
        ArrayList<Integer> gpa = new ArrayList<>();

        System.out.print("Please enter mark: ");
        mark = input.nextInt();
        while(mark != -1){

//            marks.add(input.nextInt());


            System.out.print("Please enter credit: ");
//            credits.add(input.nextInt());
            credit = input.nextInt();

            gpa.add((mark*credit)/credit);

            mark = input.nextInt();
        }



    }
}