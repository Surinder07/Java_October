package dec12.smartphone;

public class Iphone extends FileTransfer implements Calculator, Camera, Computer, Telephone{

    @Override
    public void calculate() {

    }

    @Override
    public void takePictures() {
        System.out.println("Iphone can take pictures using 3 cameras");
    }

    @Override
    public void shootVideos() {
        System.out.println(" iphone can shoot cinematic or 3d videos ");
    }

    @Override
    public void surfInternet() {

    }

    @Override
    public void makeCalls() {
        System.out.println(" make calls using HEy SIRI");
    }

    @Override
    public void receiveCalls() {
    }
}
