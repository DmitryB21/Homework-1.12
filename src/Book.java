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
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", author=" + author +
                '}';
    }
}
