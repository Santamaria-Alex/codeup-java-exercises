package OopLecture;

public class User {
    public int id;
    public String username;
    public String password;
    public String email;

    public static void main(String[] args) {
        User testUser = new User();

        testUser.id = 1;
        testUser.username = "jayman";
        testUser.password = "password";
        testUser.email = "jayman@email.com";

        System.out.println("Username: " + testUser.username);
        System.out.println("Password: " + testUser.password);
        System.out.println("Email: " + testUser.email);


        
        

    }
}
