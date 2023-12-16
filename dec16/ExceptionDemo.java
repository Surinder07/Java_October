package dec16;

public class ExceptionDemo {
    public static void main(String[] args) {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        exceptionDemo.test();
    }

    public void test(){
        System.out.println("Inside test method ");
        test2();
    }

    public void test2(){
        System.out.println("Inside test 2 method ");
        test3();
    }

    public void test3(){
        System.out.println("Inside test 3 method ");
        test4();
    }

    public void test4(){

        String s = null;
        System.out.println(s.toLowerCase());

    }

}
/*
## Student ---- study()
## Person ----  eat(){
study()
}
## Human    -- live()
{
eat()
}

## SuperHuman   -- fly()
{
live()
}

## Alien    ---- spaceFly()
{
fly()
}
S




 */