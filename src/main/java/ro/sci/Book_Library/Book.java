package ro.sci.Book_Library;

import java.util.ArrayList;

public class Book {

    ArrayList<Book> library = new ArrayList<>();
    ArrayList<Novel> novels = new ArrayList<>();
    ArrayList<ArtAlbum> artAlbums = new ArrayList<>();

    public void addNovel(String type, String novelName, String authorName, int pagesNumber) {
        Book novel = new Novel(type, novelName, authorName, pagesNumber);
        novels.add((Novel) novel);
        library.add(novel);
    }

    public void addArtAlbum(String pageQuality, String artAlbumName, String authorName, int pagesNumber) {
        Book artAlbum = new ArtAlbum(pageQuality, artAlbumName, authorName, pagesNumber);
        artAlbums.add((ArtAlbum) artAlbum);
        library.add(artAlbum);

    }

    public void deleteNovel(String novelName) {
        for (Novel n : novels) {
            if (n.getNovelName().equalsIgnoreCase(novelName)) {
                library.remove(n);
            }
        }
    }

    public void deleteArtAlbum(String artAlbumName) {
        for (ArtAlbum a : artAlbums) {
            if (a.getArtAlbumName().equalsIgnoreCase(artAlbumName)) {
                library.remove(a);
            }
        }
    }
        public void listBooks() {
            for (int i = 0; i < library.size(); i++) {
                System.out.println(library.get(i).toString());
            }
        }
    }


