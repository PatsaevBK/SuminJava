package inheritance;

public class Proger implements Worker, Driver{

    @Override
    public void drive() {
        String clsnm = getClass().getSimpleName();
        System.out.printf("%s drives%n", clsnm);

    }

    @Override
    public void work() {
        String clsnm = getClass().getSimpleName();
        System.out.printf("%s works%n", clsnm);
    }
}
