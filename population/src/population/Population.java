package population;

import java.util.Scanner;

public class Population {

    private int currentPopulation;
    private double growthRate;

    //readInput method to get user input of the current population and growth rate
    public void readInput() {

        Scanner input = new Scanner(System.in); //Scanner object to allow for user input
        boolean invalid = true;

        while (invalid) {
            invalid = false;
            try {
                System.out.print("Enter the current population of the elephants: ");
                currentPopulation = input.nextInt();

                if (currentPopulation < 0) {
                    throw new Exception("Population cannot be negative!");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                invalid = true;
            }
        }
        System.out.print("Enter the growth rate of the elephants: ");
        growthRate = input.nextDouble();

    }

    //predictPop methods to predict the population of next year and return the predicted value.
    public int predictPop() {
        double predictedPopulation = currentPopulation + (growthRate / 100) * currentPopulation;
        int finalPopulation = (int) predictedPopulation;
        return finalPopulation;
    }

    //writeOut method to output predicted Population for next year
    public void writeOutput() {
        System.out.println("The predecietd population for next year is " + predictPop());
    }

    public static void main(String[] args) {
        Population test = new Population();
        test.readInput();
        test.writeOutput();
    }

}
