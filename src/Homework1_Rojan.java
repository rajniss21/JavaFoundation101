public class Homework1_Rojan {
    public static void main(String[] args) {
        Homework1_Rojan homework1Rojan = new Homework1_Rojan();
        homework1Rojan.name();
        homework1Rojan.totaldue();
    }
    public void name() {
        System.out.println("My Name is Rojan Uprety");
    }

    public void totaldue(){
        int bookPrice = 45;
        double discount_percent = 20,total;
        total = bookPrice - (bookPrice * discount_percent/100);
        System.out.println("The total due is " + total);
    }
}
