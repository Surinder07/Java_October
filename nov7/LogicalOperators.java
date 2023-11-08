package nov7;

public class LogicalOperators {
    public static void main(String[] args) {


        int x = 13;
        int y = 25;
        int a = 12;
        int b = 12;

        boolean result1 = !(x <= y || a <=b) ;  //  false : Ekam
        boolean result2 = x == y && a <=b ; // false : Sukhjeet
        boolean result3 = x != y || a>= b ; // true : Kunal
        boolean result4 = x > y && a == b ; // false : Arpinder
        boolean result5 = x <= y || a >b ; // true : Pallavi

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);








        /*
        Logical operators

          AND &&       ---
         , OR  ||
         , NOT  !

        AND  &&
        condition 1        condition 2           result
        true                true                 true
        true                false                false
        false               true                false
        false               false               false

        OR  ||
        true                true                true
        true                false               true
        false               true                true
        false               false               false


        NOT operator !
        !true      --->    false
        false     ----> true





         */
    }
}
