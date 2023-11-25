package nov25.staticdemo;

public class StaticVariable {

    int counter= 0;

    public void show(){
        System.out.println(counter);
        counter++;
    }

    public static void main(String[] args) {

        StaticVariable s1 = new StaticVariable();
        s1.show(); // 0
        StaticVariable s2 = new StaticVariable();
        s2.show(); // 1
        StaticVariable s3 = new StaticVariable();
        s3.show(); // 2
    }
}
