public class SmartphoneMain {
    public static void main(String[] args){
        SmartphoneClass iPhone12 = new SmartphoneClass("Apple", 42, true);

        System.out.println(iPhone12.makeCall());
        System.out.println(iPhone12.chargeBattery(99));
        System.out.println(iPhone12.togglePower()); //Turning phone off
        System.out.println(iPhone12.togglePower()); //Turning phone on
    }


}
