package dec5.encapDemo;

import java.io.FileWriter;

public class Test {
    public static void main(String[] args) {

        User user = new User("User1","12345");
        //user.userLogin("User1","1234");

       /* user.password = "112233";
        user.username = "Rajan";*/

      //  user.userLogin("User1","12345");
        System.out.println(user.getPassword());
        System.out.println(user.getUsername());


        user.userLogin("Ekam","password");
        //FileWriter

    }
}
