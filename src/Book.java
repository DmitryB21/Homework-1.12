import java.util.Objects;

public class Book {

    private String nameBook;
    private int yearOfPublishing;
    private Author author;


    public Book(String nameBook, int yearOfPublishing, Author author) {
        this.nameBook = nameBook;
        this.yearOfPublishing = yearOfPublishing;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Книга{" +
                "Название книги='" + nameBook + '\'' +
                ", год издания=" + yearOfPublishing +
                ", автор=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearOfPublishing, author);
    }
}
