package nov25.staticdemo;

public class InstanceBlock {

    InstanceBlock(){
        System.out.println("Inside the constructor");
    }

    {
        System.out.println("Instance block");
    }

    public static void main(String[] args) {

        System.out.println("Inside main method");
        InstanceBlock instanceBlock = new InstanceBlock();
    }
}


// stat