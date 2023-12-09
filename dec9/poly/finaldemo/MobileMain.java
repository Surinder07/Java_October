package dec9.poly.finaldemo;

class Telephone{

    public void telephoneCall(){
        System.out.println("Normal call ");
    }

   public  void test(){
       System.out.println("test");
   }

}
class Mobile extends Telephone{
    @Override
    public void telephoneCall() {
        System.out.println("Mobile call");
    }

    @Override
    public void test() {
        System.out.println("test in mobile ");
    }
}

public class MobileMain {
    public static void main(String[] args) {

        Telephone samsung = new Mobile();
        samsung.telephoneCall();
        samsung.test();


       /* Telephone blackBerry = new BlackBerry();
        blackBerry.test();*/

       // Mobile mobile = (Mobile) new Telephone();



    }
}
