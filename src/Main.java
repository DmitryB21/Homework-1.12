public class Main {
    public static void main(String[] args) {

    Book book1 = new Book("Война и Мир", 1950, new Author("Лев", "Толстой"));
    Book book2 = new Book("Мастер и Маргарита", 1980, new Author("Михаил", "Булгаков"));

    book2.setYearOfPublishing(2000);

        System.out.println(book1);
        System.out.println(book2);
    }
}