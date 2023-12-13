package dec12.smartphone;

public class SmartPhone {
    public static void main(String[] args) {
        SamsungGalaxy samsungGalaxy = new SamsungGalaxy();
        samsungGalaxy.calculate();
        samsungGalaxy.makeCalls();
        samsungGalaxy.receiveCalls();
        samsungGalaxy.shootVideos();
        samsungGalaxy.takePictures();
        samsungGalaxy.surfInternet();

        System.out.println("************************");
        Iphone iphone = new Iphone();
        iphone.makeCalls();
        iphone.shootVideos();
        iphone.takePictures();
        iphone.airDrop();

    }
}
