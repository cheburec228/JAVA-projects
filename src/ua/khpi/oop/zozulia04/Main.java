package ua.khpi.oop.zozulia04;

import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s ="";
        String str = "";
        String[] words = str.split(" ");
        String rep = "";
		int k = 3;

        while (!"5".equals(s)){
            System.out.println("1. Ввод данных");
            System.out.println("2. Просмотр данных");
            System.out.println("3. Выполнение расчётов");
            System.out.println("4. Отображение результатов");
            System.out.println("5. Для выхода из приложения введите 5");
            s = scan.next();
            
            try {
                x = Integer.parseInt(s);
            }catch (NumberFormatException e){
                System.out.println("Неверный ввод");
            }
            
            if (s.indexOf("-h") != -1){
                System.out.println("Автор: Zozulia Vyazcheslav KN-921B");
                System.out.println("Завдання: Ввести текст. У кожному слові тексту k-ту літеру замінити заданим символом. \nЯкщо k більше довжини слова, видати повідомлення та заміну не виконувати. \nПочаткові дані та результат вивести у вигляді таблиці.");
                System.out.println("'-h' - отображается информация об авторе программы, назначении (индивидуальное задание), детальное описание режимов работы (пунктов меню и параметров командной строки)\n'-d' - в процесі роботи програми відображаються додаткові дані, що полегшують налагодження та перевірку працездатності програми: діагностичні повідомлення, проміжні значення змінних, значення тимчасових змінних та ін.");
                System.out.println("'1' - переходит к вводу переменных для расчётов.\n'2' - выводит данные, которые сохранены в системе.\n'3' - запускает вычисление по заданию.\n'4' - выводит результат.\n'5' - выходиит из программы.");
            }
            switch (x){
                    case 1:
                        // вызов метода 1
                        Scanner in = new Scanner(System.in);
    		            System.out.print("Введите строку: ");
    		            str = in.nextLine();
    		            
    		            Scanner change = new Scanner(System.in);
    		            System.out.print("Введите слово для замены: ");
    		            rep = change.nextLine();
    		            
    		            Scanner sc = new Scanner(System.in);
    		            System.out.print("Введите индекс, который будет заменён на " + rep + " в каждом слове: ");
                        k = sc.nextInt();
                        
                        
                        break;
                    case 2:
                        // вызов метода 2
                        System.out.println(str);
                        System.out.println(rep);
                        System.out.println(k);
                        break;
                    case 3:
                        // вызов метода 3
    
                        words = str.split(" ");
                        for (String word : words) {
                            word = word.substring(0, k-1) + rep + word.substring(k);
                        } break;
                    case 4:
                        // вызов метода 4
                        for (String word : words) {
                            word = word.substring(0, k-1) + rep + word.substring(k);
                            System.out.print(word + " ");
                        }
                        System.out.print("\n");
                        break;
                }
        }
        System.out.println("Гуд бай");
    }
}
