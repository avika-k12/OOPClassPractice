public class LaptopMain {
    public static void main(String[] args){
        LaptopClass ishithasMac = new LaptopClass("Apple", "Macbook Air", 1200.12f);

        System.out.println(ishithasMac.turnOn());
        System.out.println(ishithasMac.displaySpecs(15.6f,165, 440));
        System.out.println(ishithasMac.turnOff());
    }


}
