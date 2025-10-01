public class TeacherClass {
    public String name;
    public String subject;
    public int yearsOfExperience;

    public TeacherClass(String name, String subject, int yOE){
        this.name = name;
        this.subject = subject;
        this.yearsOfExperience = yOE;
    }

    public String introduce(){
        return "This is " + this.name + "!\nThey teach " + this.subject + " and have been teaching for " + this.yearsOfExperience + " years";
    }

    public String teachLesson(){
        return this.name + " has begun teaching " + this.subject;
    }

    public String retire(){
        return this.name + " has now retired after teaching for " + this.yearsOfExperience + " years";
    }
}
