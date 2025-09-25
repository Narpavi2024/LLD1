package OOPS2.Createclass.StudentConstructor;

public class Student {
    int age;
    String name;

    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    public Student(int age){
        this(age,null);
    }

    public Student(String name){
        this(0,name);
    }

    public Student(){
        this(0,null);
    }

    public void display(){
        System.out.println("Name: "+name+", Age:"+age);
    }
}
