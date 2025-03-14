public class primeiraAula {
    
    public static void main(String[] args) {
        final var male = new Person("Bruno");
        male.incAge();
        var female = new Person("Maria");
        female.incAge();
        System.out.println("Male name: " + male.getName() + " Age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " Age: " + female.getAge());
    }
}