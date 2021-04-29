package Oleh.Shevchenko;

public class Main {
    public static final int LEFTPART = 999;
    public static final int RIGTHPART = 999;

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < LEFTPART; i++) {
            for (int j = 0; j < RIGTHPART; j++) {
                if (i / 100 % 10 + i / 10 % 10 + i % 10 == j / 100 % 10 + j / 10 % 10 + j % 10) {
                    count++;
                }
            }
        }
        System.out.println("total lucky tickets is: " + count);
    }
}
