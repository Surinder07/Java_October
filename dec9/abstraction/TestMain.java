package dec9.abstraction;

 abstract class MobileDevice{

    public  abstract void keyboard();
    public abstract void makeCalls();
    public abstract void receiveCalls();

}
class Nokia extends MobileDevice{

     public void snakeGame(){
         System.out.println("snake games... ");
     }

    @Override
    public void keyboard() {
        System.out.println("This has old style keyboard ");
    }

    @Override
    public void makeCalls() {
        System.out.println("make calls by dialing buttons");
    }

    @Override
    public void receiveCalls() {
        System.out.println("receive calls by dialing buttons");
    }
}

abstract class BlackBerry extends MobileDevice{

     public abstract void messagingService();

    @Override
    public void keyboard() {
        System.out.println("QWERTY keyboard");
    }

    @Override
    public void makeCalls() {

        System.out.println("calling using dialpad");
    }

    @Override
    public void receiveCalls() {

        System.out.println("receive calls using dialpad ");
    }
}
class SmartPhone extends MobileDevice{

    @Override
    public void keyboard() {

    }

    @Override
    public void makeCalls() {
        System.out.println("make calls using hey siri ");
    }

    @Override
    public void receiveCalls() {

        System.out.println("receive calls using touch screen ");
    }
}
public class TestMain {
    public static void main(String[] args) {

        MobileDevice mobileDevice = new SmartPhone();
        mobileDevice.keyboard();
        mobileDevice.makeCalls();
        mobileDevice.receiveCalls();
    }
}


/*


Nokia 3310 ---- ke
physical keypad, black and white screen , abstract [make calls and receive calls]
   |

Blackberry  -- Qwerty keypad , color screen , [make calls and receive calls]
  |
  Smart phone    -- touch screen , color, {make calls and receive calls}


 */

/*

Bank of canada -- 5% , transfer, deposit, withdraw
governing body regulates the rate of interst,  authority {implemtation }

  create a bank class , rateOfInterst(),
  scotiabank, bmo, rbc  -- provide a specific rate of interst


 */