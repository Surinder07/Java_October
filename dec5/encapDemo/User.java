package dec5.encapDemo;

public class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void userLogin(String uname, String pass){
        if(username.equals(uname) && password.equals(pass)){
            System.out.println("You are authorized to login ");
        }
        else{
            System.out.println("Invalid user credentails.");
        }

    }
}

// can you make a class as readonly : 5
// write only ?
// ExcelSheet    ---- column, row
// you can only read the column,  row data
// can not change or update anything