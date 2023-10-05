package inheritance;

public class Client {

    public void makeOrder(Waiter waiter, String order) {
        waiter.carryOrder(order);
    }
}
