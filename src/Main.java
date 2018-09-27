import ru.valiullin.Library.*;

public class Main {

    /**
     * Есть набор объектов типа "Книга". Каждая книга имеет название, автора, год издания. Можно больше, по желанию.
     * todo
     * Программа должна уметь:
     * добавлять книгу в библиотеку.
     * показывать список книг в библиотеке.
     * восстанавливать содержимое библиотеки после перезапуска.
     * показывать соответствующее сообщение в случае ошибок.
     * Важно! потоки обязательно должны закрываться, отсутствие файла на диске - не ошибка, а частный случай пустой библиотеки
     */

    private static Library library;

    public static void main(String[] args) {

        YongReadeer yongReadeer = new YongReadeer("boya","boya123","superBoya");

        //library = new Library(yongReadeer);
        //addLiterature();
        //library.saveLib();

        library = Library.loadLib();
        library.showLib();
    }

    private static void addLiterature() {

        Literature literature = new Book();
        literature.setName("Learn Java");
        literature.setAuthor("Кэтти Сиерра, Берт Бэйтс");
        literature.setPages(800);
        library.addLiterature(literature);

        literature = new Book();
        literature.setName("Гиперион");
        literature.setAuthor("Дэн Симонс");
        literature.setPages(500);
        library.addLiterature(literature);

        literature = new Journal();
        literature.setName("Техника молодежи");
        literature.setAuthor("Василий Захарченко");
        literature.setPages(100);
        library.addLiterature(literature);

        literature = new Newspapper();
        literature.setName("Guardian");
        literature.setAuthor("Кэтрин Винер");
        literature.setPages(60);
        library.addLiterature(literature);

    }


}
