package person;
public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;//a keyword that refers to the current object
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Person Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public void greeting() {
    System.out.println("Hello " + this.name);
    }
    
    
}

