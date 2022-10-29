public class Main {
    public static void main(String[] args) {

        System.out.println("Books and authors");

        String bookName ;
        Author author;
        String editionYear;


        Book borisgodunov = new Book ("author1", " Борис Годунов ", 1831 );
        Book СhartingTechniques = new Book("author2", "Charting Techniques.", 1991 );

        Author author1 = new Author("Alexander", "Pushkin");
        Author author2 = new Author( "Steve", "Nison");

        borisgodunov.setEditionYear();
        borisgodunov.getEditionYear();
        borisgodunov.getAuthor();
        borisgodunov.getBookName();

        СhartingTechniques.getEditionYear();
        СhartingTechniques.getBookName();
        СhartingTechniques.getAuthor();

        System.out.println(" Книга " + borisgodunov.getBookName() + ", автор " + borisgodunov.getAuthor() +
                ", год издания " + borisgodunov.getEditionYear());
        System.out.println(" Книга " + СhartingTechniques.getBookName() + ", автор " + СhartingTechniques.getAuthor() +
                ", год издания " + СhartingTechniques.getEditionYear());
    }
}