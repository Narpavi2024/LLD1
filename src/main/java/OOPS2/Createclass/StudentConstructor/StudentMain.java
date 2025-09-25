package OOPS2.Createclass.StudentConstructor;

//Create a class Student with following requirements
//
//        Two data members
//        age : int
//name : String
//Four constructors
//Default constructor : Should set age to 0 and name to null
//Constructor with int parameter : Should set age to the passed parameter and name to null
//Constructor with String parameter : Should set name to the passed parameter and age to 0
//Constructor with two parameters - int and String : Should set the age to int parameter and name to String parameter
//The assignment code should only be in the 4th constructor. The top 3 constructors should use telescoping to invoke the 4th constructor.
public class StudentMain {
    public static void main(String[] args) {
     Student s1 = new Student(); //Default
     Student s2 = new Student(30);
     Student s3 = new Student("Sabari");
     Student s4 = new Student(30,"Sabari");
     s1.display();
     s2.display();
     s3.display();
     s4.display();
    }
}
