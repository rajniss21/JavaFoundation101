public class Homework3_Rojan {
    public static void main(String[] args) {
        Homework3_Rojan homework3Rojan = new Homework3_Rojan();
        homework3Rojan.EvenNumber();
        homework3Rojan.Switch();
        homework3Rojan.Grade();
    }
    public void EvenNumber(){
        int num = 346;
        if(num % 2 == 0){
            System.out.println(num + ":This is even number");
        }
        else{
            System.out.println(num + ":This is odd number");
        }
    }
    public void Switch(){
        int day = 20;
        switch (day){
            case 1:
                System.out.printf("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Provided value is not within the range");
        }
    }
public void Grade(){
        int grade = 60;
        if(grade >= 90 & grade <=100){
            System.out.println("Excellent! Your homework grade is A!");
    } else if (grade >=80 & grade <=89) {
            System.out.println("Great work! Your homework grade is B!");
        } else if (grade >= 70 & grade <=79) {
            System.out.println("Improvement needed! Your homework grade is C!");
        }
        else if (grade >= 60 & grade <=69) {
            System.out.printf("Close fail, try harder! Your homework grade is D!");
        }
        else if (grade >= 0 & grade <=59) {
            System.out.println("Sorry, failed, let's try again! Your homework grade is F!");
        }
        else{
            System.out.println("Invalid homework grade!");
        }
}
}
