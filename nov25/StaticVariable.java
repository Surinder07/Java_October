package nov25;

public class StaticVariable {

    static int counter= 0;

    public void show(){
        System.out.println(counter);
        counter ++;
    }

    public static void main(String[] args) {

        StaticVariable s1 = new StaticVariable();
        s1.show();
        StaticVariable s2 = new StaticVariable();
        s2.show();
        StaticVariable s3 = new StaticVariable();
        s3.show();
    }
}
