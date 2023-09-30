//>>>Chapter 5 Recursion

package RecursionPracticeExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


////>>> Factorial algorithm
//    public static void main(String args[]) {
//        int num = 4;
//        System.out.println("Factorial of " + num + " is: " + factorial(num));
//    }
//
//    public static Integer factorial(Integer n){
//        System.out.println(n);
//        if (n == 0)
//            return 0;
//        return n + factorial(n-1);
//    }
//}
////<<<


// >>> reverseArray algorithm
    public static void main(String args[]) {

        System.out.println("This program determines if a word entered by the user in a palindrome.\n");
        System.out.println("A palindrome is equal to its reverse\n");

        Scanner input = new Scanner(System.in); //create scanner object for input

        System.out.println("Enter your word: ");
        String word = input.next();     //get user input
        char[] data = word.toCharArray();
        boolean result;


        if (Arrays.equals(word.toCharArray(), reverseArray(data, 0, data.length - 1))) {
            result = true;
        } else
            result = false;

        System.out.println("Word: '" + word + "' is a palindrome: " + result);

    }

    public static char[] reverseArray(char[] data, int low, int high) {
        if (low < high) {
            char temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            return reverseArray(data, low + 1, high - 1);
        }
        return data;
    }
}

//<<<


//    // Function to check for consonant
//    static boolean isConsonant(char ch) {
//        // To handle lower case
//        ch = Character.toUpperCase(ch);
//
//        return !(ch == 'A' || ch == 'E' ||
//                ch == 'I' || ch == 'O' ||
//                ch == 'U');
//    }
//
//    static boolean isVowel(char ch) {
//        // To handle lower case
//        ch = Character.toUpperCase(ch);
//
//        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
//    }
//
//
//    // to count total number
//// of consonants from  0 to n-1
//    static int totalConsonants(String str1) {
//        int count1 = 0;
//
//        for (int i = 0; i < str1.length(); i++)
//
//            if (isConsonant(str1.charAt(i))) // Check for vowel
//
//                ++count1;
//
//        return count1;
//    }
//
//    static int countVowels(String str) {
//        int count = 0;
//
//        for (int i = 0; i < str.length(); i++)
//
//            if (isVowel(str.charAt(i))) // Check for vowel
//
//                ++count;
//
//        return count;
//    }
//
//    public static void main(String args[]) {
//        System.out.println(" please enter a word ");
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//        String str = word;
//        String str1 = word;
//        int v = countVowels(str);
//        int c = totalConsonants(str1);
//
//        System.out.println("Amount of vowels found word: " + v);
//        System.out.println("Amount of consonants found in word: " + c);
//
//        if (v > c) {
//            System.out.println("word has more vowels");
//        } else if (v < c) {
//            System.out.println("word has more consonants");
//        } else if (v == c) {
//            System.out.println("word has the same amount of vowels and consonants");
//        }
//
//    }
//}
