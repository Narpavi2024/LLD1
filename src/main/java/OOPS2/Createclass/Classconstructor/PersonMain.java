package OOPS2.Createclass.Classconstructor;
//Create a class Person with following requirements
//
//        Should have a data-member age
//Should have a data-member name
//Should support a constructor with both age and name
public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person(25,"Sabari");
        Person person1 = new Person(24,"Kanth");
        person.display();
        person1.display();

    }
}
