import java.util.Scanner;

public class Books {

    public String title;
    public String author;
    public Integer publicationYear;

    public Books(String title, String author, Integer publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }


    public static void main(String[] args) {
        

    }
}

