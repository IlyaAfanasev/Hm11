public class Book {
    private String bookTitle;
    String authorName;
    int publishingYear;

    public Book(String bookTitle, String authorName, int publishingYear) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getName() {
        return this.authorName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
