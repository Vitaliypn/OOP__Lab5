package flower.store;

public class Main{
    double z = 'c';
    public static void main(String[] args) {
        Main pv = new Main();
        pv.new Print().value();
    }
    class Print {
        int x = 15;
        void value() {
            System.out.println(x);
            System.out.println((int) z);
            System.out.println("Output " + x + z);
        }
    }
}