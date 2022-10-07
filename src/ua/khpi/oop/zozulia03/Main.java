package ua.khpi.oop.zozulia03;

/**
 * Завдання: Ввести текст. У кожному слові тексту k-ту літеру замінити заданим символом. 
 * Якщо k більше довжини слова, видати повідомлення та заміну не виконувати. 
 * Початкові дані та результат вивести у вигляді таблиці.
 *
 * @author Zozulia Vyazcheslav KN-921B
 *
 * @Version 1.0
 */


/**
 * Program Entry Point
 *
 * @param args command line parameters
 */
public class Main
{

	public static void main(String[] args) {
	    
	    String[] text = "При работе со строками важно понимать, что объект String является неизменяемым".split(" ");
	    String word = "Слово";
        int k = 3;
        for (int i = 0; i < text.length; i++) {
            if (text[i].length() >= k) {
                text[i] = text[i].substring(0, k - 1) + word + text[i].substring(k);
            }
        }
        System.out.println(String.join(" ", text));
	}
}
