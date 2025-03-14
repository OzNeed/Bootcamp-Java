import java.time.OffsetDateTime;

public class Person {

    private final String name;

    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public Person(String name){
        this.name = name;
        this.age = 1; // Para começar com o valor definido
    }
    // Esse é um construto com parametro.
    
    public String getName(){
        return this.name;
    }
   
    public int getAge(){
        return this.age;
    }

    public void incAge(){
        if(this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;
        // se ele entrar no if ele não vai incrementar
        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
        //caso não entre ele vai incrementar
    }
}
