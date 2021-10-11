package ro.sci.Book_Library;

public class Main {

    public static void main(String[] args) {

        Book book = new Book();
        book.addNovel("mystery", "Gone Girl", "Gillian Flynn", 432);
        book.addNovel("mistery", "The DaVinci Code", "Dan Brown", 572);
        book.addArtAlbum("great", "Surrender", "Hurts", 10);
        book.addArtAlbum("poor", "Low", "David Bowie", 4);


//        book.deleteNovel();
//
//        book.deleteArtAlbum();

        book.listBooks();

    }
}
