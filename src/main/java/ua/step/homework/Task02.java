package ua.step.homework;

/**
 * В массиве хранится n явно заданных текстовых строк.
 * <p>
 * Создать методы:
 * • Возвращает содержимое массива в виде строки через пробел (join)
 * • Возвращает содержимое массива в виде строки через заданный разделитель (перегруженный join)
 * • Сортирующий массив обратном порядке (без учёта регистра) от z до a (sortDesc);
 * • Сортирующий массив по количеству слов в строке (слова разделены пробелами) (sortByWordCount).
 * <p>
 * Примечание: Не использовать методы строк и стандартную сортировку
 */
// gg wp
public class Task02 {
    public static void main(String[] args) {
        // TODO: Проверяйте методы здесь
    }

    /**
     * Соединяет массив строк в одну строку разделенную пробелом
     *
     * @param strings - массив строк
     * @return строка состоящая из элементов массив
     */
    public static String join(String[] strings) {
        // TODO: удалите исключение и пишите здесь код
        String str = strings[0];
        for (int i = 1; i < strings.length; i++) {
            str = str + " " + strings[i];
        }
        return str;
    }

    /**
     * Соединяет массив строк в одну строку разделенную соединителем glue
     *
     * @param strings - массив строк
     * @param glue    - соединитель
     * @return строка состоящая из элементов массива
     */
    public static String join(String[] strings, String glue) {
        // TODO: удалите исключение и пишите здесь код
        String str = strings[0];
        for (int i = 1; i < strings.length; i++) {
            str = str + glue + strings[i];
        }
        return str;
    }

    /**
     * Сортирует массив строк в порядке обратном алфавитному
     *
     * @param strings - массив строк для сортировки
     */
    public static void sortDesc(String[] strings) {
        // TODO: удалите исключение и пишите здесь код
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < i; j++) {
                if (strings[j].compareToIgnoreCase(strings[i]) < 0) {
                    String tmp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = tmp;
                }
            }
        }
    }

    /**
     * Сортирует массив строк по количеству слов в строке
     *
     * @param strings - массив строк для сортировки
     */
    public static void sortByWordCount(String[] strings) {
        // TODO: удалите исключение и пишите здесь код

    }
}