public class Main {
    public static void main(String[] args) {

        System.out.println("Books and authors");

        String bookName ;
        String authorName;
        String editionYear;

        Book borisgodunov = new Book (" Pushkin Alexandr ", 1831, " Борис Годунов ");
        Book JapaneseCandlestickСhartingTechniques = new Book("Steve Nison", 1991, "Japanese Candlestick charting Techniques.");

        borisgodunov.setEditionYear();
        borisgodunov.getEditionYear();
        borisgodunov.getAuthorName();
        borisgodunov.getBookName();

        JapaneseCandlestickСhartingTechniques.getEditionYear();
        JapaneseCandlestickСhartingTechniques.getBookName();
        JapaneseCandlestickСhartingTechniques.getAuthorName();

        System.out.println(" Книга " + borisgodunov.getBookName() + ", автор " + borisgodunov.getAuthorName() + ", год издания " + borisgodunov.getEditionYear());
        System.out.println(" Книга " + JapaneseCandlestickСhartingTechniques.getBookName() + ", автор " + JapaneseCandlestickСhartingTechniques.getAuthorName() +
                ", год издания " + JapaneseCandlestickСhartingTechniques.getEditionYear);
    }
}