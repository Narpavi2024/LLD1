package OOPS3.MethodOverloadingandoverriding.ScalerLearning;

public class User {

    String username;
    String email;
    public User(String username,String email){
        this.username = username;
        this.email = email;
    }
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void displayInfo(){
        System.out.println("Username: "+username);
        System.out.println("Email: "+email);
    }
}
