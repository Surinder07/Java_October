package nov25;

public class StaticBlock {
    public void  show(){
        System.out.println("Inside the show method ");  //5
    }

    public static void display(){
        System.out.println("Inside display method ");   //4
    }

    {
        System.out.println("Hello inside the instance block"); //3
    }
    static {
        System.out.println("Inside static block");  //1
    }
    public static void main(String[] args) {
        System.out.println("Inside main method ");   // 2
        StaticBlock s = new StaticBlock();
        StaticBlock.display();
        s.show();
    }


}

// 1. static 1
// static 2
// static 3
// 4.Inside main method