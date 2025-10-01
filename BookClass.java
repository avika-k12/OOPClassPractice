public class BookClass {
    public String title;
    public String author;
    public int pages;
    public int currentPage;

    public BookClass(String title, String author, int pages, int currentPage){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.currentPage = currentPage;
    }

    public String readPage(int nowPage){
        this.currentPage = nowPage;
        return "You are reading " + this.title + " and are on page number " + this.currentPage;
    }

    public String bookmarkPage(int page){
        this.currentPage = page;
        return "You have stopped reading on page " + this.currentPage;
    }

    public String displayInfo(){
        return "You are reading " + this.title + ". It is by " + this.author;
    }
}
