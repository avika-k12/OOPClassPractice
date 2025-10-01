public class WeatherReportClass {
    public float temp;
    public int humidity;
    public String condition;

    public WeatherReportClass(float t, int h, String c){
        this.temp = t;
        this.humidity = h;
        this.condition = c;
    }

    public String displayReport(){
        return "Right now, it is " + this.temp + " degrees, " + this.humidity + "% humid and " + this.condition;
    }

    public String updateCondition(String newC){
        this.condition = newC;
        return "The condition has changed! It is now " + this.condition;
    }

    public String isStormLikely(){
        if (this.temp <= 12.8f && this.condition == "cloudy"){
            return "A storm is likely!";
        }
        else {
            return "A storm is unlikely - phew!";
        }
    }
}
