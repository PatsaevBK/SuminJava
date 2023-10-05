package inheritance;

public class Director implements Worker{
    @Override
    public void work() {
        String clsnm = getClass().getSimpleName();
        System.out.printf("%s drives%n", clsnm);
    }
}
