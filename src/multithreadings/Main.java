package multithreadings;

import java.util.Random;

public class Main {
    private static volatile boolean isWin = false;
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        Thread thread = new Thread(
                () -> {
                    Random rnd1 = new Random();
                    while (!isWin) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        int n = rnd1.nextInt(100);
                        if (n == number) {
                            isWin = true;
                        }
                    }
                    System.out.println("Thread has guessed number!");
                }
        );
        thread.start();
        Thread thread1 = new Thread(
                () -> {
                    int i = 0;
                    while (!isWin) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(i);
                        i++;
                    }
                }
        );
        thread1.start();
    }
}
