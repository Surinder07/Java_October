package dec16.basicExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) throws FileNotFoundException{
        rest();

    }

    public static void best () throws FileNotFoundException {

            test();
    }

    public static void rest() throws FileNotFoundException {

        best();
    }

    public static void test() throws FileNotFoundException{

        File file = new File("nonexistent.txt");
        Scanner scanner = new Scanner(file);
    }


}

