package dec12.smartphone;

public class SamsungGalaxy implements Calculator, Camera, Telephone, Computer{
    @Override
    public void calculate() {
        System.out.println("SamsungGalaxy is calculating... ");
    }

    @Override
    public void takePictures() {
        System.out.println("SamsungGalaxy can take pictures at 50MP");
    }

    @Override
    public void shootVideos() {
        System.out.println("videos shot at 100x zoom ");
    }

    @Override
    public void surfInternet() {
        System.out.println("Samsung supports 3 party apps from internet ");
    }

    @Override
    public void makeCalls() {
        System.out.println(" Use google AI to make calls ");
    }

    @Override
    public void receiveCalls() {
        System.out.println(" slide to receive calls.. ");
    }
}
