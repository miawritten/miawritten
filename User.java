public class User {

    String username;
    String email;
    int age;

    User(){
        this.username = "Aurora";
        this.email = "Aurora@gmail.com";
        this.age = 28;
    }

    User(String username) {
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    User(String username, String email,int age ) {
        this.username = username;
        this.email = email;
        this.age = age;
}}
