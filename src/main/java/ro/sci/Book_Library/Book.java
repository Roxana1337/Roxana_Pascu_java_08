package ro.sci.Book_Library;

import java.util.ArrayList;

public class Book {

    ArrayList<Book> library = new ArrayList<>();
    String bookName;
    String authorName;
    int pagesNumber;

    public void addNovel (String type, String bookName, String authorName, int pagesNumber) {
        Book novel = new Novel (type, bookName, authorName, pagesNumber);
        library.add(novel);
    }

    public void addArtAlbum (String pageQuality, String bookName, String authorName, int pagesNumber) {
        Book artAlbum = new ArtAlbum (pageQuality, bookName, authorName, pagesNumber);
        library.add(artAlbum);
    }

    public void deleteNovel(String type, String bookName, String authorName, int pagesNumber) {
    }

    public void deleteArtAlbum(String type, String bookName, String authorName, int pagesNumber) {
    }

        public void listBooks() {
        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i).toString());
        }
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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

    public ArrayList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }
}
