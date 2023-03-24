public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Толстой", "Лев");
        Author tolstoy1 = new Author("Толстой", "Лев");
        Author bulgakov = new Author("Булгаков", "Михаил");
        Book warAndPeace = new Book("Война и Мир", tolstoy, 1865);
        Book masterAndMargarita = new Book("Мастер и маргарита", bulgakov, 1966);
        Book masterAndMargarita1 = new Book("Мастер и маргарита", bulgakov, 1967);
        System.out.println("Книга 1. Автор-" + tolstoy.getAuthorName() + ". Название-" + warAndPeace.getBookTitle() + ". Год публикации-" + warAndPeace.getPublishingYear());
        System.out.println("Книга 2. Автор-" + bulgakov.getAuthorName() + ". Название-" + masterAndMargarita.getBookTitle() + ". Год публикации-" + masterAndMargarita.getPublishingYear());
        masterAndMargarita.setPublishingYear(1967);
        System.out.println("Книга 3. Автор-" + bulgakov.getAuthorName() + ". Название-" + masterAndMargarita.getBookTitle() + ". Год публикации-" + masterAndMargarita.getPublishingYear());
        System.out.println("------------");
        System.out.println(warAndPeace);
        System.out.println(masterAndMargarita);

        if (tolstoy.equals(bulgakov)) {
            System.out.println("Такой автор уже есть");
        } else {
            System.out.println("Это другой автор");
        }

        if (tolstoy.equals(tolstoy1)) {
            System.out.println("Такой автор уже есть");
        } else {
            System.out.println("Это другой автор");
        }

        if (warAndPeace.equals(masterAndMargarita)) {
            System.out.println("Такая книга уже есть");
        } else {
            System.out.println("Это другая книга");
        }

        if (masterAndMargarita.equals(masterAndMargarita1)) {
            System.out.println("Такая книга уже есть");
        } else {
            System.out.println("Это другая книга");
        }
    }
}
