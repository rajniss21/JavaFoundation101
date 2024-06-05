public class Homework5TryCatchExceptions {
    public static void main(String[] args) {
         /*
      Homework #5 - Try Catch Exceptions

      Assignment #1
      1.) Declare a String variable named str with the value of "123".
      2.) Attempt to print the fourth character of our String using charAt() method.
      3.) Since we don't have a fourth character for the string, catch the specific
      exception (StringIndexOutOfBoundsException) and handle it.
      4.) Print out a custom exception message:
      "This is why QA Engineers always have to do boundary testing! The string only has 3 characters, and you've requested a 4th."
     */
        System.out.println("Assignment #1");
        // Write the missing part here


        // Check the answers and submit your homework by clicking 'Submit' button at the top right
    /*

     OPTIONAL HOMEWORK ONLY

     For our optional homework (not required), let's create a java application
     which will catch an InputMismatchException.
     InputMismatchException occurs when the user input is invalid for the expected
     type using the Java Scanner class (Scanner class is used to get User Input).
     Example: If a program expects an integer value but the user enters a String
     value instead. It is somewhat similar to entering PIN codes (requires
     numbers) in real world scenario.

     Instructions:
     1.) First, we have to create an object of the Scanner class, it can be found
     in the java.util. package which needs to be imported.
     Example: Scanner scanner = new Scanner(System.in);
     2.) Next, let's print out the message for the user input.
     "Please enter a number or integer:"
     3.) Inside our try catch statement, declare an integer 'myInteger' and use
     the Scanner class method .nextInt() which is used to retrieve the value of
     the user input.
     Example: int myInteger = scanner.nextInt();
     4.) If the user enters a String value, we will encounter the exception;
     otherwise, print the integer or number entered by the user.
     5.) Print out a custom exception message: "Please enter an integer or number!"

     Output for string input: "Please enter an integer or number!"
     Output for integer input: "You entered 62!
     Note: Given, the user has entered 62 in the console
     */
        System.out.println("Optional Homework");
        // Write the missing part here

    }
}


