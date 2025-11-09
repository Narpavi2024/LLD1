package DesignPattern.Builderpattern;

public class Student {
    String name;
    int age;
    int gradeyear;
    String batch;
    double psp;
    String univname;
    String phonenumber;

    public static Builder getBuilder(){
         return new Builder();
    }

    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.gradeyear = builder.gradeyear;
        this.psp = builder.psp;
    }

   public static class Builder{
       String name;
       int age;
       int gradeyear;
       String batch;
       double psp;
       String univname;
       String phonenumber;

       public String getName() {
           return name;
       }

       public Builder setName(String name) {
           this.name = name;
           return this;
       }

       public int getAge() {
           return age;
       }

       public Builder setAge(int age) {
           this.age = age;
           return this;
       }

       public int getGradeyear() {
           return gradeyear;
       }

       public Builder setGradeyear(int gradeyear) {
           this.gradeyear = gradeyear;
           return this;
       }

       public String getBatch() {
           return batch;
       }

       public Builder setBatch(String batch) {
           this.batch = batch;
           return this;
       }

       public double getPsp() {
           return psp;
       }

       public Builder setPsp(double psp) {
           this.psp = psp;
           return this;
       }

       public String getUnivname() {
           return univname;
       }

       public Builder setUnivname(String univname) {
           this.univname = univname;
           return this;
       }

       public String getPhonenumber() {
           return phonenumber;
       }

       public Builder setPhonenumber(String phonenumber) {
           this.phonenumber = phonenumber;
           return this;
       }

       public Student build(){
           //validation start
           if (this.getAge() < 20){
               throw new RuntimeException("Age shouldnt be leass than 20");
           }
           if (this.getGradeyear() > 2023){
               throw new RuntimeException("Grade year shouldn't be more than 2023");
           }
           return new Student(this);
       }



    }

}
