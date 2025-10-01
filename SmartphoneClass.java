public class SmartphoneClass {
    public String brand;
    public int batteryLevel;
    public boolean isOn;

    public SmartphoneClass(String brand, int batteryLevel, boolean isOn){
        this.brand = brand;
        this.batteryLevel = batteryLevel;
        this.isOn = isOn;
    }

    public String makeCall(){
        return "You are now making a call! RING RING!";
    }

    public String chargeBattery(int newBattery){
        this.batteryLevel = newBattery;
        return "You have charged your phone! It is now on " + this.batteryLevel + "%";
    }

    public String togglePower(){
        if(this.isOn){
          this.isOn = false;
          return "Your phone is now switched off";
        }
        else{
            this.isOn = true;
            return "Your phone is now switched on";
        }
    }
}
