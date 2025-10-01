public class CarMain {
    public static void main(String[] args){
        CarClass avyaanCar = new CarClass("BMW", "Electric", 2018);

        System.out.printf("This is Avyaan's Car!!! \n");
        System.out.printf("He has a " + avyaanCar.make + "\n");
        System.out.printf("The model is " + avyaanCar.model + "\n");
        System.out.printf("He got it in " + avyaanCar.year + "\n");

        System.out.print(avyaanCar.accelerate());
        System.out.print(avyaanCar.breaked());
        System.out.print(avyaanCar.honk());
    }
}
