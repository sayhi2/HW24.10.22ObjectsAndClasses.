public class Book {
    public String getEditionYear;
//1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
// Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
//2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
//3. Написать конструкторы для обоих классов, заполняющие все поля.
//4. Создать геттеры для всех полей автора и всех полей книги.
//5. Создать сеттер для поля «Год публикации» у книги.
//6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга.
// Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
//Метод main не должен находиться в классах Book и Author.
//Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
//7. В том же методе main изменить год публикации одной из книг с помощью сеттера.
//

    private String bookName;
    private String authorName;
    public int editionYear;



    public Book(String authorName, int editionYear, String bookName) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.editionYear = editionYear;
    }
    //Book JapaneseCandlestickChartingTechniques = new Book(" Steve Nison ", 1991, " Japanese Candlestick charting Techniques.");
    //Book BorisGodunov = new Book(" Pushkin Alexandr ", 1831, " Boris Godunov ");

    public String getBookName() {
        return bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public int getEditionYear() {
        return editionYear;
    }
    public void setEditionYear() {
        this.editionYear = editionYear;
    }


}

