import java.util.Random;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean isBorrowed;

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
    public boolean getBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        isBorrowed = true;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public int generateIsbn() {
        int isbn = 0;
        Random random = new Random();
        isbn = random.nextInt(999999999);
        return isbn;
    }

}
