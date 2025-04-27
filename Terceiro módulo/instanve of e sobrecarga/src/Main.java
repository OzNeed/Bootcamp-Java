public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee salasman = new Salasman();
        Manager manager = new Manager();

        System.out.println(employee instanceof Employee);
        System.out.println(salasman instanceof Employee);
        System.out.println(manager  instanceof Employee);
    }
}
