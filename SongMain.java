public class SongMain {
    public static void main(String[] args){
        SongClass ESNY = new SongClass("Ever Since New York", "Harry Styles", 253);

        System.out.println(ESNY.displayInfo());
        System.out.println(ESNY.play());
        System.out.println(ESNY.pause(120));
    }
}
