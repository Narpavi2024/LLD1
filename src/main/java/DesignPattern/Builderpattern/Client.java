package DesignPattern.Builderpattern;

public class Client {
    public static void main(String[] args) {
      Student student = Student.getBuilder()
              .setName("Narpavi")
              .setAge(21)
              .setGradeyear(2023)
              .setPhonenumber("12345").build();
        System.out.println("DEBUG");
    }
}
