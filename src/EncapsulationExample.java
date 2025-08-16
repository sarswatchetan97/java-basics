class Person {
     //Private data members
    private String name;
    private int age;

    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Public method to access private data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println("Name: " +person.getName());
        System.out.println("Age: " +person.getAge());

        person.setAge(35);
        System.out.println("Age: " +person.getAge());

        person.setName("Neeraj");
        System.out.println("Name: " +person.getName());
    }
}
