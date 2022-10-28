public class Main {
    public static void main(String[] args) {

        System.out.println("Books and authors");

        String bookName ;
        String authorName;
        String year;

        Book borisgodunov = new Book (" Pushkin Alexander ", " Борис Годунов ", 1831 );
        Book СhartingTechniques = new Book("Steve Nison", "Charting Techniques.", 1991 );

        borisgodunov.setYear();
        borisgodunov.getYear();
        borisgodunov.getAuthorName();
        borisgodunov.getBookName();

        СhartingTechniques.getYear();
        СhartingTechniques.getBookName();
        СhartingTechniques.getAuthorName();

        System.out.println(" Книга " + borisgodunov.getBookName() + ", автор " + borisgodunov.getAuthorName() + ", год издания " + borisgodunov.getYear());
        System.out.println(" Книга " + СhartingTechniques.getBookName() + ", автор " + СhartingTechniques.getAuthorName() +
                ", год издания " + СhartingTechniques.getYear());
    }
}