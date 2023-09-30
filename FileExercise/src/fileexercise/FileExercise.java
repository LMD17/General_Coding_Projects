package fileexercise;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class FileExercise {

    public static void main(String[] args) {

        //READING FROM A FILE
        String filename = "out.txt";

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));
            byte digits = inputStream.readByte();
            
            while (digits != -1) {                
                System.out.println(digits);
                digits = inputStream.readByte();
            }
            inputStream.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error opening the file " + filename);
        }catch (IOException e) {
            System.out.println("Problem with the file " + filename);
        }
//        //WRITEING TO A FILE
//        String filename = "digits.dat";
//        int digits;
//
//        try {
//            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename));
//
//            Scanner input = new Scanner(System.in);
//
//            System.out.println("Enter the digits (-1 to exit): ");
//
//            do {
//                digits = input.nextInt();
//                outputStream.writeInt(digits);
//            } while (digits >= 0);
//
//            System.out.println("The file has been writen to file: " + filename);
//        } catch (FileNotFoundException e) {
//            System.out.println("Error opening the file " + filename);
//        } catch (IOException e) {
//            System.out.println("Problem with the file " + filename);
//        }
        

//        //WRITEING TO A FILE
//        String filename = "digits.dat";
//        int digits;
//
//        try {
//            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename));
//
//            Scanner input = new Scanner(System.in);
//
//            System.out.println("Enter the digits (-1 to exit): ");
//
//            do {
//                digits = input.nextInt();
//                outputStream.writeInt(digits);
//            } while (digits >= 0);
//            
//            System.out.println("The file has been writen to file: " + filename);
//        } catch (FileNotFoundException e) {
//            System.out.println("Error opening the file " + filename);
//        } catch (IOException e) {
//            System.out.println("Problem with the file " + filename);
//        }
    }
}

//PROGRAMS
//ORDER 1
//        //PRINTING TO A TXT FILE
//        String filename = "out.txt";    //should associate your file with a local variable
//        
//        PrintWriter outputStream = null;    //global variable
//        try {
//            outputStream = new PrintWriter(filename); //connect outputStream to filename
//        System.out.println("We are practising writting to the file");
//        System.out.println("Please provide some contents:");
//        
//        Scanner input = new Scanner(System.in);
//        
//        for (int count = 1; count <= 4; count++) {
//            String line = input.nextLine(); //get user input
//            outputStream.println(count + " " + line); //writing line from user to txt file
//        }
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Error! Unable to open file " + filename);
//            System.exit(0);
//        }
//        
//        
//        outputStream.close();
//        System.out.println("The file has been populated with the input");
//ORDER 2
//        //READING THE CONTENTS OF A FILE
//        String filename = "out.txt";  //file from which we want to read from
//        
//        Scanner inputStream = null;
//        try {
//            inputStream = new Scanner(new File(filename));    //connect outputStream to filename
//            
//        while (inputStream.hasNext()) {
//            String line = inputStream.nextLine();
//            System.out.println(line);   //output each line
//        }
//
//        } catch (FileNotFoundException e) {
//            System.out.println("We could not open file: " + filename);
//            System.exit(0);
//        }
//        
//        
//        inputStream.close();
//ORDER 3
//        //READING FROM A FILE THAT THE USER SPECIFIES
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please provide the name of the file that you want to read from: ");
//        String filename = input.next();     //get filename from user
//        
//        Scanner inputStream = null;
//        
//        try {
//            inputStream = new Scanner(new File(filename));    //connect outputStream to filename
//        System.out.println("The contents of the file " + filename + " is as follows:");
//        while (inputStream.hasNext()) {
//            String line = inputStream.nextLine();
//            System.out.println(line);   //output each line
//        }
//        inputStream.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found!");
//            System.exit(0);
//        }
//        inputStream.close();
//ORDER 4
//        //COMMA SEPARETED CONTENT IN A FILE
//        String filename = "Sales.txt";
//        int count = 1;
//        double totalPrice = 0;
//        Scanner inputStream = null;
//        try {
//            inputStream = new Scanner(new File(filename));  //connect inputStream to filename
//
//            while (inputStream.hasNext()) {
//                String line = inputStream.nextLine();
//
//                if (count == 1) {
//                    String[] productDetails = line.split(" ");
//                    for (String productDetail : productDetails) {
//                        System.out.print(productDetail.trim() + "   ");
//                    }
//                    System.out.println("\n");
//                } else {
//                    String[] productDetails = line.split(",");
////                    System.out.println(Arrays.toString(productDetails));
//                    totalPrice += Integer.parseInt(productDetails[1].trim()) * Double.parseDouble(productDetails[2].trim());
//                    for (String productDetail : productDetails) {
//                        System.out.print(productDetail.trim() + "\t");
//                    }
//                    System.out.println("\n");
//
////                //get each item into a variable
////                String ID = productDetails[0];
////                int quantity = Integer.parseInt(productDetails[1]); //parse to convert to integer
////                double price = Double.parseDouble(productDetails[2]);
////                String description = productDetails[3];
////                //output each item
////                System.out.println("Here is the sales report");
////                System.out.println(ID);
////                System.out.println(quantity);
////                System.out.println(price);
////                System.out.println(description);
//                    //find the total
////                totalPrice += quantity * price;
//                    System.out.println("Total cost: R" + totalPrice + "\n");
//                    
//                    System.out.println("SALES REPORT");
//                    System.out.printf("Sold %s units of %s (ID: %s) at R%s each.\n\n"
//                            , productDetails[1].trim(), productDetails[3].trim()
//                            , productDetails[1].trim(), productDetails[2].trim());
//                }
//                count++;
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Error! File not found!!");
//        } catch (IOException e) {
//            System.out.println("Error! Problem with the contents of the file " + filename);
//        }
//        inputStream.close();
