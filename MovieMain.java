public class MovieMain {
    public static void main(String[] args){
        MovieClass TheTrumanShow = new MovieClass("The Truman Show", "Drama", 10);

        System.out.println(TheTrumanShow.displayDetails());
        System.out.println(TheTrumanShow.play());
        System.out.println(TheTrumanShow.rateMovie(11));

    }
}
