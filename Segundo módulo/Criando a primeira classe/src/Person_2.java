public record Person_2(String name, int age) {

    //compact constructor
    public Person_2{

    }
    // Outro construtor
    public Person_2(String name){
        this(name, 1);
    }
    
    // pode trabalhar com metódos
    public String getInfo(){
        return "Name: " + name + " age: " + age;
    }
}
