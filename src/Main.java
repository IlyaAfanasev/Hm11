public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Толстой Лев");
        Author bulgakov = new Author("Булгаков Михаил");
        Book warAndPeace = new Book("Война и Мир", tolstoy.getAuthorName(), 1865);
        Book masterAndMargarita = new Book("Мастер и маргарита", bulgakov.getAuthorName(), 1966);
        System.out.println("Книга 1. Автор-" + warAndPeace.getName() + ". Название-" + warAndPeace.getBookTitle() + ". Год публикации-" + warAndPeace.getPublishingYear());
        System.out.println("Книга 2. Автор-" + masterAndMargarita.getName() + ". Название-" + masterAndMargarita.getBookTitle() + ". Год публикации-" + masterAndMargarita.getPublishingYear());
        masterAndMargarita.setPublishingYear(1967);
        System.out.println("Книга 3. Автор-" + masterAndMargarita.getName() + ". Название-" + masterAndMargarita.getBookTitle() + ". Год публикации-" + masterAndMargarita.getPublishingYear());

    }
}