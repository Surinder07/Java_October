package nov28;

public class CompareStringsDemo {
    public static void main(String[] args) {
        String s1 = "pragra";
        String s2 = "pragra";
        String s3 = new String("pragra");
        String s4 = new String("company");


        // .equals()
        // ==   --- address and content as well
        // compareTo()

       /* System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true 2  / false 2 / not sure
        System.out.println(s1.equals(s3)); // true    / false
*/
        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); // false
        System.out.println(s2== s3); // falase
        System.out.println(s3 == s4); // false


        // scp
       // s1 --   --------------> pragra
        // s2------


        // compareTo()

        String t1 = "The Chatpter "; // 84
        String t2 = "t"; // 116
        System.out.println(t1.compareTo(t2));
        // s1 < s2 --- negative value
        // s1 > s22 -- positive value
        // s1 = s2   -- 0


    }
}
