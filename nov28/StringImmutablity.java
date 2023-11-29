package nov28;

public class StringImmutablity {
    public static void main(String[] args) {
        // Strings in Java are immutable
        // String can not be changed.
        String s1 = "pragra";
        String s2  = s1;


        s1 = s1 + "company";

        System.out.println("S1 : "+s1); // pragracompany
        System.out.println("S2 : "+s2); // pragra


        int int1 = 5;
        int int2 = int1;

        System.out.println("Int 2 "+int2); // 5

        int1 = int1 + 1; // 6
        System.out.println(int1);

        System.out.println("Int 2 " + int2);



    }
}
