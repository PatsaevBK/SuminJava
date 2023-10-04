public class Main {
    public static void main(String[] args) {
        MyArrayList employees = getEmployees();
        employees.add("LOX");
        System.out.println(employees.getSize());
//        employees.remove("John");
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }

    private static MyArrayList getEmployees() {
        MyArrayList employees = new MyArrayList();
        employees.add("John");
        employees.add("Lol");
        employees.add("kek");
        return employees;
    }
}