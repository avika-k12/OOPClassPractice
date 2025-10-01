public class WeatherReportMain {
    public static void main(String[] args){
        WeatherReportClass whatsTheWeather = new WeatherReportClass(10, 33, "sunny");

        System.out.println(whatsTheWeather.displayReport());
        System.out.println(whatsTheWeather.isStormLikely());
        System.out.println(whatsTheWeather.updateCondition("cloudy"));
        System.out.println(whatsTheWeather.isStormLikely());
    }
}
