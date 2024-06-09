import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Homework5_Rojan {
    public static void main(String[] args) {
        Homework5_Rojan homework5Rojan = new Homework5_Rojan();
        homework5Rojan.ExceptionHandling();
        homework5Rojan.InputExceptionHandling();
    }
    public void ExceptionHandling(){
        String str = "123";
        try {
            System.out.println(str.charAt(3));
        }
        catch (StringIndexOutOfBoundsException e1) {
            System.out.println(" This is why QA Engineers always have to do boundary testing! The string only has 3 characters, and you've requested a 4th.");
        }
    }
    public void InputExceptionHandling(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number or integer:");

        try{
            int myinteger = sc.nextInt();
            System.out.println("You entered " + myinteger +"!");
        }
        catch(InputMismatchException e2) {
            System.out.println(e2 + " Please enter an integer or number!");
        }
    }
}



