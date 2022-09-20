import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args) {
        int inputOne = 1;
        int inputTwo = 2;
        System.out.println("(Simulated Input)Please enter one number to compare: " + inputOne);
        System.out.println("(Simulated Input)Please enter another number to compare: " + inputTwo);

        if (inputOne == inputTwo) {
            System.out.println("These numbers are equal.");
        }
        else if (inputOne > inputTwo) {
            System.out.println(inputTwo + " is less than " + inputOne);
        }
        else if (inputTwo > inputOne) {
            System.out.println(inputOne + " is less than " + inputTwo);
        }
        else {
            System.out.println("That is not a number. Please try again.");
        }
    }
}