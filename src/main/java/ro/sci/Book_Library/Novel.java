package ro.sci.Book_Library;

public class Novel extends Book {

    String novelName;
    String authorName;
    int pagesNumber;
    String type;

    public Novel (String type, String novelName, String authorName, int pagesNumber) {
        this.type = type;
        this.novelName = novelName;
        this.authorName = authorName;
        this.pagesNumber = pagesNumber;
    }

    public String getNovelName() {
        return novelName;
    }

    public void setNovelName(String novelName) {
        this.novelName = novelName;
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
    public String toString() { return "Novel: Book type: " + type + ", " + " Book name: " + novelName + ", " +
            " Author name: " + authorName + ", " + " Pages number: " + pagesNumber;}

}
