package DesignPattern.PrototypePattern;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String batch;
    private double avgbatch;
    private double psp;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAvgbatch(double avgbatch) {
        this.avgbatch = avgbatch;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public Student(Student student){
        this.name = student.name;
        this.batch = student.batch;
        this.age = student.age;
        this.avgbatch = student.avgbatch;
        this.psp = student.psp;
    }
    public Student(){

    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
