import java.util.Arrays;

public class ArraysExercises {


    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    public static Person[] addPerson(Person[] array, Person newPerson){
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson;
        return people;
    }


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person person1 = new Person("Alex");
        Person person2 = new Person("Shogun");
        Person person3 = new Person("Santamaria");

        Person[] personArray = new Person[3];
        personArray[0] = person1;
        personArray[1] = person2;
        personArray[2] = person3;

        for (Person p : personArray){
            System.out.println(p.getName());
        }

        System.out.println("----------");

        Person sophia = new Person("Sophia");
        personArray = addPerson(personArray, sophia);
        for (Person person : personArray){
            System.out.println(person.getName());
        }







//        String[] Person = new String[3];
//        Person[0] = "Alex";
//        Person[1] = "Shogun";
//        Person[2] = "Santamaria";
//
//        for (String newPerson : Person){
//            System.out.println(newPerson);
//        }







        }

    }
