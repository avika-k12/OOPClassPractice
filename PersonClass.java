public class PersonClass {
    public String name;
    public int age;
    public String gender;

    public PersonClass(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String introduceSelf(){
        return "This person is called " + this.name + "!";
    }

    public String celebrateBirthday(int newAge){
        this.age = newAge;
        return "HOORAY! " + this.name + " is now " + newAge + "!";
    }
}
