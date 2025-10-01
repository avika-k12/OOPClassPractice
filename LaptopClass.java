public class LaptopClass {
    public String brand;
    public String model;
    public float price;

    public LaptopClass(String brand, String model, float price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String turnOn(){
        return "Your " + this.brand + " " + this.model + " is now on";
    }

    public String turnOff(){
        return "Your " + this.brand + " " + this.model + " is now off";
    }

    public String displaySpecs(float inches, int refreshRate, int brightness){
        return "Size: " + inches + " inches.\nRefresh Rate: " + refreshRate + " Hz.\nBrightness: " + brightness + " nits.";
    }

}
