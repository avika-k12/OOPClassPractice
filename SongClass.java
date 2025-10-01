public class SongClass {
    public String title;
    public String artist;
    public float duration;

    public SongClass(String title, String artist, float duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String play(){
        return "You are now playing " + this.title + " by " + this.artist;
    }

    public String pause(float timestamp){
        return "You have now paused " + this.title + " by " + this.artist + " at " + timestamp + " seconds";
    }

    public String displayInfo(){
        return "This song is called " + this.title + ".\nIt is by " + this.artist + " and it is " + this.duration + " seconds long";
    }
}
