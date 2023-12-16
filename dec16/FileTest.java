package dec16;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {

        System.out.println("Hello ");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Hello after thread.");

    }
}
