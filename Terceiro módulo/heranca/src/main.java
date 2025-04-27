import Domain.Employee;
import Domain.Manager;
import Domain.Salasman;


public class main {

    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salasman());
    }
    
    public static void printEmployee(Employee employee){

        System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
        switch (employee) {
            case Manager manager -> {
                manager.setCode("123");
                manager.setName("Bruno");
                manager.setSalary(5000);
                manager.setLogin("bruno");
                manager.setPassword("123456");
                manager.setComission(1200);
        
                
                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());
                System.out.println(manager.getFullSalry(500));
            }
            case Salasman salesman ->{
                salesman.setCode("456");
                salesman.setName("Hugo");
                salesman.setSalary(2800);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);
                
                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
            }
        }
        System.out.println(employee.getFullSalry());
        System.out.println("==============");
    }

}