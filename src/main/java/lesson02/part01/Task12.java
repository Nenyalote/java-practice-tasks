package lesson02.part01;

/**
 * Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
 * Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
 * МылаРамуМама
 * РамуМамаМыла
 * ...
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Выведенный текст должен содержать 6 строк.
 * 3.	Текст в каждой строке должен быть уникален.
 * 4.	Должны быть выведены все возможные комбинации.
 */

public class Task12 {
    public static void main(String[] args) {
        String mama = "Мама";
        String myla = "Мыла";
        String ramu = "Раму";


        System.out.println(mama+myla+ramu);
        System.out.println(mama+ramu+myla);
        System.out.println(myla+mama+ramu);
        System.out.println(myla+ramu+mama);
        System.out.println(ramu+mama+myla);
        System.out.println(ramu+myla+mama);

    }
}
