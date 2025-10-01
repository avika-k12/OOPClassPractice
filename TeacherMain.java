public class TeacherMain {
    public static void main(String[] args){
        TeacherClass MrBradley = new TeacherClass("Mr Bradley", "Computer Science", 3);

        System.out.println(MrBradley.introduce());
        System.out.println(MrBradley.teachLesson());
        System.out.println("A few moments later...");
        System.out.println(MrBradley.retire());
    }
}
