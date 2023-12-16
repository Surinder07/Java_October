package dec16;

public class StringDemo {
    public static void main(String[] args) {

        String s = "PRAGRA";

        s = null;
        String s1 = null;
        try{
           s1 = s.toLowerCase();
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        //System.out.println(s1);
        System.out.println("After the string values ");

    }
}
