public class Main {
    public static void main(String[] args) {

        String bookName;
        Author author;
        String editionYear;


        Author author1 = new Author("Alexander ", "Pushkin");
        Book book1 = new Book(author1, "Boris Godunov ", 1831);

        Author author2 = new Author("Steve", " Nison");
        Book book2 = new Book(author2, "Japanese Candlestick Charting Techniques.", 1991);

        System.out.println("Автор: " + author1.getName());
        System.out.println(" Название книги: " + book1.getBookName());
        System.out.println(" Год издания книги: " + book1.getEditionYear());
        book1.setEditionYear(1831);
        System.out.println(" Год переиздания книги: " + book1.getEditionYear());

        System.out.println("Автор: " + author2.getName());
        System.out.println(" Название книги: " + book2.getBookName());
        System.out.println(" Год издания книги: " + book2.getEditionYear());
        book1.setEditionYear(1991);
        System.out.println(" Год переиздания книги: " + book2.getEditionYear());
    }
}