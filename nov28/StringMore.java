package nov28;

public class StringMore {
    public static void main(String[] args) {

        String str = "   Hello World    ";
        String str2 = "hello world";
        String substring = str.substring(2,6);
        System.out.println(substring);
        System.out.println(str.equalsIgnoreCase(str2));
        String replace = str.replace('H', 'T');
        System.out.println(replace);

        System.out.println(str.indexOf('l'));
        System.out.println(str.trim());
        System.out.println(str);

        System.out.println(str.isEmpty());

        System.out.println(str.toUpperCase());

        char c = str.charAt(6);
        System.out.println(c);

        System.out.println(str.length());

        char[] chars = str.toCharArray();

        for (char e: chars) {
            System.out.println(e);
        }
        // mutable
        StringBuilder stringBuilder = new StringBuilder("test");
        System.out.println(stringBuilder.reverse());
        // can you reverse this String = "Pragra" ?
    }
}
