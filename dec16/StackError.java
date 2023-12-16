package dec16;

public class StackError {
    public static void main(String[] args) {

        StackError stackError = new StackError();
        stackError.cup();
    }


     public void cup(){
        table();
     }

     public void table(){
        cup();
     }
}
