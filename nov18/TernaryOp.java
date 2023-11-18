package nov18;

public class TernaryOp {
    public static void main(String[] args) {
        int number = 10;
        if(number % 2 == 0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd  ..");
        }
// Variable = condition? statement1:statement2;
                        // true/false
        int result = number % 2 == 0 ? 1 : 0;

        System.out.println(result);


    }
}
