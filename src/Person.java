public class Person {
    private String name;

    // getName() returns a string
    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + name + "\n");
    }

    // constructor??
    //The class should have a constructor that accepts a `String` value and sets
    //the person's name to the passed string.
    public Person(String name){
        this.name = name;
    }



    public static void main(String[] args) {
        // instantiating a new object
        Person person = new Person("Alex");
        System.out.println("OG name: " + person.getName());
        person.setName("Shogun");
        System.out.println("New name: " + person.getName());
        person.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); //John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //Jane
//        System.out.println(person2.getName()); //Jane
    }




}
