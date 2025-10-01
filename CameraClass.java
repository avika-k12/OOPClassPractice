public class CameraClass {
    public int resolution1;
    public int resolution2;
    public int batteryLevel;
    public int storageCap;

    public CameraClass(int res1, int res2, int batLev, int stoCap){
        this.resolution1 = res1;
        this.resolution2 = res2;
        this.batteryLevel = batLev;
        this.storageCap = stoCap;
    }

    public String takePhoto(){
        return "CLICK! You just snapped a photo!";
    }

    public String chargeBattery(int newBatteryLevel){
        this.batteryLevel = newBatteryLevel;
        return "You have now charged your camera to " + this.batteryLevel + "%";
    }

    public String displayStatus(){
        return "Your camera has " + this.resolution1 + "x" + this.resolution2 + " resolution, " + this.batteryLevel + "% battery and " + this.storageCap + "GB of storage capacity";
    }
}

