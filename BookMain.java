public class BookMain {
    public static void main(String[] args){
        BookClass myBook = new BookClass("The Murders", "Lucy Wittington", 212, 12);

        System.out.println(myBook.displayInfo());
        System.out.println(myBook.readPage(22));
        System.out.println(myBook.bookmarkPage(26));

    }
}
