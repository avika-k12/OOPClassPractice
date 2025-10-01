public class PersonMain {
    public static void main(String[] args){
        PersonClass Maya = new PersonClass("Maya", 16, "Female");
        PersonClass Astrid = new PersonClass("Astrid", 16, "Female");

        System.out.println(Maya.introduceSelf());
        System.out.println(Astrid.celebrateBirthday(17));
    }
}
