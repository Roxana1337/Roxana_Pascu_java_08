package ro.sci.Book_Library;

import java.util.Scanner;

public class Novel extends Book {

    String bookName;
    String authorName;
    int pagesNumber;
    String type;

    public Novel (String type, String bookName, String authorName, int pagesNumber) {
        this.type = type;
        this.bookName = bookName;
        this.authorName = authorName;
        this.pagesNumber = pagesNumber;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() { return "Novel: Book type: " + type + ", " + " Book name: " + bookName + ", " +
            " Author name: " + authorName + ", " + " Pages number: " + pagesNumber;}

}
