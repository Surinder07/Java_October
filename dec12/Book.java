package dec12;

public interface Book {

    // public static final, Java 7 or below
    int price = 0;

    // public abstract
    void read();
}

class FictionNovel implements Book{

    @Override
    public void read() {
        System.out.println("I am reading Harry Potter");
    }
}
class MainTest {
    public static void main(String[] args) {
        //Book book = new Book();
        Book fictionNovel = new FictionNovel();
        fictionNovel.read();
    }
}


/*
final ---> constant
class ----> you can not extend the class
method ----> can not override the method


// create a class
                   Bird [C]
                |         |
        Parrot [C]        Penguin [C]
interface -- canFly()     ---> flying()
 */