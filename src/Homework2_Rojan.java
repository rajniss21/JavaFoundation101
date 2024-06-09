public class Homework2_Rojan{
    public String phrase;
    public static void main(String[] args) {
        Homework2_Rojan homework2_rojan = new Homework2_Rojan();
        homework2_rojan.charlength();
        homework2_rojan.printspecificchar();
        homework2_rojan.comparestring();
    }
    public void charlength(){
        String phrase = "I never dreamed about success. I worked for it";
        System.out.println(phrase.length());
    }
    public void printspecificchar(){
        String name = "Estee Lauder",quote;
        quote = name + "-" + phrase;
        System.out.println(quote);
    }

    public void comparestring(){
        String val1 = "0CT0PUS", val2 = "0CT0PUS";

        if ( val1.equals(val2)){
            System.out.println("Provided Value/Strings are same");
        }
        else {
            System.out.println("Provided Values/Strings arenot same");
        }
    }
}