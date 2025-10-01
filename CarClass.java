public class CarClass {
    public String make;
    public String model;
    public int year;
    public int speed;

    public CarClass(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    public String accelerate(){
        this.speed += 10;
        return this.make + " is accelerating!! It is now going " + this.speed + "\n";
    }

    public String breaked(){
        if (this.speed >= 10){
            this.speed -= 10;
            return "Your speed has been reduced to " + this.speed + "\n";
        }
        else {
            return "You're going too slow!!" + "\n";
        }
    }

    public String honk(){
        return "HONK!!";
    }
}
