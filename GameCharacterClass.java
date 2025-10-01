public class GameCharacterClass {
    public String name;
    public int health;
    public int level;

    public GameCharacterClass(String n, int h, int l){
        this.name = n;
        this.health = h;
        this.level = l;
    }

    public String attack(){
        this.health --;
        return "OH NO! " + this.name + " has been attacked! Health: " + this.health;
    }

    public String heal(){
        this.health++;
        return "YAY! " + this.name + " has been healed! Health: " + this.health;
    }

    public String levelUp(){
        this.level++;
        return "HOORAY! " + this.name + " has levelled up! Level: " + this.level;
    }
}
