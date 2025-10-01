public class CameraMain {
    public static void main(String[] args){
        CameraClass AvikasPrizedCanonCamera = new CameraClass(3000, 4000, 56, 32);

        System.out.println(AvikasPrizedCanonCamera.displayStatus());
        System.out.println(AvikasPrizedCanonCamera.takePhoto());
        System.out.println(AvikasPrizedCanonCamera.chargeBattery(100));
    }
}
