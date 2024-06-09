public class Homework4_Rojan {
    public static void main(String[] args) {
        Homework4_Rojan homework4Rojan = new Homework4_Rojan();
        homework4Rojan.EvenLoop();
        homework4Rojan.LoopDecrement();
        homework4Rojan.Multiplication();

    }

    public void EvenLoop() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void LoopDecrement() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public void Multiplication() {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i * j);
                if (j < 12) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
