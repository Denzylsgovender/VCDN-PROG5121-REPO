package person;
public class Person {
    // Private fields
    private String name;
    private int age;

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Setter method for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the age field
    public int getAge() {
        return age;
    }
// Setter method for the name field
    public void setAge(int age) {
        this.age = age;
    }
    
    
    public static void main(String[] args) 
// Think about where you want to place your main method...
    {
    Person person = new Person();
        
    // Using setter methods to set values
    person.setName("Brock Lesnar");
    person.setAge(38);

    // Using getter methods to retrieve values
    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());
    }
}
