package DesignPattern.PrototypePattern;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
         fillregistry(studentRegistry);
        Student sabarikanth =  studentRegistry.get("Feb").clone();
        sabarikanth.setName("Sabari");
        sabarikanth.setAge(30);

        Student narpavi = studentRegistry.get("Mar").clone();
        narpavi.setName("Narpavi");
        narpavi.setAge(2);
        System.out.println("DEBUG");

    }

    private static void fillregistry(StudentRegistry studentRegistry) {

        Student student1 = new Student();
        student1.setBatch("Feb");
        student1.setAvgbatch(80.0);
        studentRegistry.registry("Feb",student1);

        Student student2 = new Student();
        student2.setBatch("Mar");
        student2.setAvgbatch(85.0);
        studentRegistry.registry("Mar",student2);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatch("Apr");
        intelligentStudent.setAvgbatch(90);
        intelligentStudent.iq = 100;
        studentRegistry.registry("Apr",intelligentStudent);

    }
}
