package dec2;

public class MutableStringExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("pragra");
        //System.out.println(sb);

        sb.append(" Incorp");

        System.out.println(sb);
        // String vs StringBuffer
        //immutable      - Mutable

        System.out.println(sb.reverse());
        System.out.println(sb.capacity());

        StringBuilder stringBuilder = new StringBuilder("Remote");

        // StringBuffer vs StringBuilder ?
        // Thread safe    vs     not thread safe
        // Synchronized   vs non synchronized

        // string     --- thread safe , immutable
        //
        // stringbuffer  -- thread safe , mutable
        // stringbuilder -- not thread safe , mutable

    }
}
