public class DogClass {
    public String name;
    public String breed;
    public int age;

    public DogClass(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;

        System.out.println(this.name + " has been created!");
    }

    public String bark(){
        return this.name + " is saying BARK!!";
    }

    public String fetch(){
        return this.name + " is playing fetch!!";
    }

    public String celebrateBirthday(){
        this.age ++;
        return "It's " + this.name + "'s birthday today! They are " + this.age + " now!";
    }
}
