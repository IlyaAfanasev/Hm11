import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author author;
    private int publishingYear;

    public Book(String bookTitle, Author author, int publishingYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return  author.getAuthorName()+". "+bookTitle +". "+ publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) && author.equals(book.author)&&publishingYear==book.publishingYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author,publishingYear);
    }
}
