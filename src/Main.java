import inheritance.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.makeOrder(new Waiter() {
            @Override
            public void carryOrder(String order) {
                System.out.println(order);
            }
        }, "Pizza");
    }

    private static void lesson35() {
        Director d = new Director();
        Proger p = new Proger();
        Cock c = new Cock();

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(d);
        workers.add(p);
        workers.add(c);
        for (Worker w:
             workers) {
            w.work();
            if (w instanceof Driver) {
                ((Driver) w).drive();
            }
        }
    }

    private static String getName(String str) {
        int firstIndexOfName = 1;
        for (int i = firstIndexOfName; i < str.length(); i++) {
            char ch = str.charAt(i);
            StringBuilder builder = new StringBuilder();
            if (Character.isUpperCase(ch)) {
                builder.append(ch);
                Character nextCh = str.charAt(++i);
                while (!nextCh.equals(' ')) {
                    builder.append(nextCh);
                    nextCh = str.charAt(++i);
                }
                String resultName = builder.toString();
                resultName = resultName.replaceAll("\\p{Punct}", "");
                return resultName;
            }
        }
        return "Default Name";
    }

    private static int getNumber(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                stringBuilder.append(ch);
            }
        }

        try {
            return Integer.parseInt(stringBuilder.toString());
        } catch (NumberFormatException e) {
            return -1;
        }

    }
}