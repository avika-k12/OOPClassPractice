public class GameCharacterMain {
    public static void main(String[] main){
        GameCharacterClass Mario = new GameCharacterClass("Mario", 5, 1);
        GameCharacterClass Peach = new GameCharacterClass("Peach", 5, 1);
        GameCharacterClass Toad = new GameCharacterClass("Toad", 5, 1);

        System.out.println(Mario.attack());
        System.out.println(Mario.attack());
        System.out.println(Mario.heal());
        System.out.println(Toad.levelUp());
        System.out.println(Peach.attack());
        System.out.println(Peach.heal());
        System.out.println(Mario.levelUp());
        System.out.println(Peach.levelUp());
        System.out.println(Toad.levelUp());
    }
}
