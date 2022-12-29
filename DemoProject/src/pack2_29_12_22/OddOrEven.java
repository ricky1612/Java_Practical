package pack2_29_12_22;

public class OddOrEven implements Runnable {
    private int number;

    public OddOrEven(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new OddOrEven(1));
        t1.start();

        Thread t2 = new Thread(new OddOrEven(2));
        t2.start();
    }
}