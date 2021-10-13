package ro.sci.Book_Library;

public class ArtAlbum extends Book {

    String artAlbumName;
    String authorName;
    int pagesNumber;
    String pageQuality;

    public ArtAlbum(String pageQuality, String artAlbumName, String authorName, int pagesNumber) {
        this.pageQuality = pageQuality;
        this.artAlbumName = artAlbumName;
        this.authorName = authorName;
        this.pagesNumber = pagesNumber;
    }


    public String getPageQuality() {
        return pageQuality;
    }

    public void setPageQuality(String pageQuality) {
        this.pageQuality = pageQuality;
    }

    public String getArtAlbumName() {
        return artAlbumName;
    }

    public void setArtAlbumName(String artAlbumName) {
        this.artAlbumName = artAlbumName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString() { return "Art Album: Page quality: " + pageQuality + ", " + " Book name: " + artAlbumName
            + ", " + " Author name: " + authorName + ", " + " Pages number: " + pagesNumber;}

}
