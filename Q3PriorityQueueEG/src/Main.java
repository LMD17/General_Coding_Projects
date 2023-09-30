public class Main {
    public static void main(String[] args) {

        [15:18] Tariro Bonyongwa

package dentistappointment;

/**
 *
 * @author btari
 */
import java.util.Scanner;
        public class DentistAppointment {

        public static void main(String[] args) {       HeapPriorityQueue <Integer, String> waitingList = new  HeapPriorityQueue();

      Scanner selection = new Scanner(System.in);

/// assistant must chose an option
                System.out.println("Please chose an option");        System.out.println("Option:n1.Add\n2.Remove patient\n3.Print Waiting List\n4.Exit");
                int optionSelected = selection.nextInt();

///response to the options chosen by the assistance
                Entry<Integer,String> elementInWaitingList;

                while(optionSelected !=4)
                {
                    if(optionSelected ==1)
                    {    System.out.println("Provide your name");    String patientName = selection.next();

                        System.out.println("Provide ranking from 1 to 30 ");    int urgencyRank  = selection.nextInt();

/// insert this into the priority que
                        waitingList.insert(urgencyRank, patientName);

    System.out.println("The patienct is added  " +patientName);
                    }

                    else if(optionSelected == 2)
                    {  //ç removes the element
                        elementInWaitingList = waitingList.removeMin();    System.out.println("Patient removed from the que "  +elementInWaitingList.getValue()+                          "Their key is " +elementInWaitingList.getKey());
                    }

                    else if(optionSelected == 3)
                    {  //print the entries in the que

                        int numOfPatient = waitingList.size();
                        for(int i =0; i< numOfPatient; i++)
                        {
                            elementInWaitingList = waitingList.removeMin();    System.out.println("Patient  "  +elementInWaitingList.getValue()+                          "Has priority " +elementInWaitingList.getKey());
                        }
                    }
                    else
                    {    System.out.println("Invalid");
                    }
                    System.out.println("Please chose an option");
                    System.out.println("Option:n1.Add\n2.Remove patient\n3.Print Waiting List\n4.Exit");
                    optionSelected = selection.nextInt();
                }   System.exit(0);
            }
        }


    }
}