package arrays.temperature;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysTemperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("How many temperatures would you like to enter?");
//        int numTemp = input.nextInt();
//
//        double[] temp = new double[numTemp];    //declaring array
//        double totalTemperature = 0;
//
//        //populating array
//        System.out.println("Enter in " + numTemp + " temperatures.");
//        for (int index = 0; index < numTemp; index++) {
//            System.out.print("Enter temperature " + (index + 1) + ": ");
//            temp[index] = input.nextDouble();
//            totalTemperature += temp[index];
//        }
//
//        double average = totalTemperature / numTemp;
//        System.out.println("\nThe average of the " + numTemp + " temperatures is " + average);
//
//        for (int index = 0; index < numTemp; index++) {
//
//            if (temp[index] < average) {
//                System.out.println("Temperature " + temp[index] + " is less than average.");
//            } else if (temp[index] == average) {
//                System.out.println("Temperature " + temp[index] + " is equal to average.");
//            } else {
//                System.out.println("Temperature " + temp[index] + " is greater than average.");
//            }
//
//        }
//
//        System.out.println("---------------------------");
//        System.out.println("Enhanced FOR loop");
//        for (double temperature : temp) {
//            if (temperature < average) {
//                System.out.println("Temperature " + temperature + " is less than average.");
//            } else if (temperature == average) {
//                System.out.println("Temperature " + temperature + " is equal to average.");
//            } else {
//                System.out.println("Temperature " + temperature + " is greater than average.");
//            }
//        }
        Mulitdimentional Arrays
        EG1
        Declaration
        int[][] multiD = new int[2][2];

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print("Enter value: ");
                multiD[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.println("Value: ");
                System.out.println(multiD[row][col]);
            }
        }
        EG 2 BANK
        int[][] multiDim = new int[4][6];

        for (int row = 0; row < 4; row++) {

            //populating the columns int the multiDim array
            for (int col = 0; col < 6; col++) {
                multiDim[row][col] = getBalance(500.00, row + 1, 5 + 0.5 * col);  //rate increase by 0.5 as we go through each column (column 0 we start with 5 % then column 1 5.5% etc.)
            }
        }

        System.out.println("These are the balances accoring to the different interest rates\n");
        System.out.println("Years\t5.00%\t5.50%\t6.00%\t6.50%\t7.00%\t7.50%");
        
        //Display the contents of the array
        for (int row = 0; row < 4; row++) {
            System.out.print(row+1);
            for (int col = 0; col < 6; col++) {
                System.out.print("\tR" + multiDim[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int getBalance(double initialAmount, int years, double rate) {
        double accBalance = initialAmount;
//        for (int count = 1; count <= years; count++) {
//            accBalance = accBalance * (1 + rate / 100);
//        }

        accBalance = accBalance * Math.pow((1 + rate / 100), years);    //calculate balance afer interest

        return (int) (Math.round(accBalance));
     
    }

}
