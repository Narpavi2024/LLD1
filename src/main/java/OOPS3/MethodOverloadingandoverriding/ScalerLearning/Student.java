package OOPS3.MethodOverloadingandoverriding.ScalerLearning;

public class Student extends User{

    int studentId;
    String course;

    public Student(String username,String email,int studentId,String course){
        super(username, email);
        this.studentId = studentId;
        this.course = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Student Id: "+studentId);
        System.out.println("Course: "+course);
    }

    public static void main(String[] args) {
        Student student = new Student("jane_doe", "jane.doe@example.com", 101, "Computer Science");
        System.out.println("Username: "+student.getUsername());
        System.out.println("Email: "+student.getEmail());
        System.out.println("Student Id: "+student.getStudentId());
        System.out.println("Course: "+student.getCourse());
    }
}
