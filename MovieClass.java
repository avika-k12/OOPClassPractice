public class MovieClass {
    public String title;
    public String genre;
    public int rating;

    public MovieClass(String title, String genre, int rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String play(){
        return "You are now watching " + this.title;
    }

    public String rateMovie(int newRating){
        this.rating = newRating;
        return "The rating for " + this.title + " is now " + this.rating;
    }

    public String displayDetails(){
        return "This movie is " + this.title + "\nIt falls under the " + this.genre + " genre \nIt's current rating is " + this.rating + "\n";
    }
}
