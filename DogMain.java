public class DogMain {
    public static void main(String[] args){
        DogClass Coco = new DogClass("Coco", "Pug", 5);

        System.out.println(Coco.bark());
        System.out.println(Coco.fetch());
        System.out.println(Coco.celebrateBirthday());

    }
}
