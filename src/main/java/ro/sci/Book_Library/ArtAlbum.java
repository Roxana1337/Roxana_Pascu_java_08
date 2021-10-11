package ro.sci.Book_Library;

public class ArtAlbum extends Book {

    String bookName;
    String authorName;
    int pagesNumber;
    String pageQuality;

    public ArtAlbum(String pageQuality, String bookName, String authorName, int pagesNumber) {
        this.pageQuality = pageQuality;
        this.bookName = bookName;
        this.authorName = authorName;
        this.pagesNumber = pagesNumber;
    }


    public String getPageQuality() {
        return pageQuality;
    }

    public void setPageQuality(String pageQuality) {
        this.pageQuality = pageQuality;
    }

    @Override
    public String toString() { return "Art Album: Page quality: " + pageQuality + ", " + " Book name: " + bookName
            + ", " + " Author name: " + authorName + ", " + " Pages number: " + pagesNumber;}

}
