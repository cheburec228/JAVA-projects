# 3. Утилітарні класи. Обробка масивів і рядків

## Тема
- Розробка власних утилітарних класів.
- Набуття навичок вирішення прикладних задач з використанням масивів і рядків.
## 1. Вимоги
- Розробити та продемонструвати консольну програму мовою Java в середовищі Eclipse для вирішення прикладної задачі за номером, що відповідає збільшеному на одиницю залишку від ділення на 15 зменшеного на одиницю номера студента в журналі групи.
- При вирішенні прикладних задач використовувати латинку.
- Продемонструвати використання об'єктів класу StringBuilder або StringBuffer.
- Застосувати функціональну (процедурну) декомпозицію - розробити власні утилітарні класи (особливий випадок допоміжного класу, див. Helper Class) та для обробки даних використовувати відповідні статичні методи.
- Забороняється використовувати засоби обробки регулярних виразів: класи пакету java.util.regex (Pattern, Matcher та ін.), а також відповідні методи класу String (matches, replace, replaceFirst, replaceAll, split).

### 1.1 Розробник
- Зозуля Вячеслав Олегович
- КН-921в
- 4 варіант

### 1.2 Загальне завдання
- Скомпілювати проект у терміналі
- Оформити роботу
- Продемонструвати використання об'єктів класу StringBuilder або StringBuffer.
- При вирішенні прикладних задач використовувати латинку.

### 1.3 Задача
- Ввести текст. У кожному слові тексту k-ту літеру замінити заданим символом. Якщо k більше довжини слова, видати повідомлення та заміну не виконувати. Початкові дані та результат вивести у вигляді таблиці.

## 2. Опис програми
- Структура программи:
  - Головний клас з точкою входа в програму знаходиться у пакеті: ua.khpi.oop.zozulia03.Main
- Компіляція програми у терміналі:
  - ![image](https://user-images.githubusercontent.com/67918913/198597237-6f696fdb-407e-445a-bfd8-63436384af16.png)
  
### 2.1 Засоби ООП
- Java code convention
- JDK:
- StringBuilder
  
### 2.2 Ієрархія та структура класів
- Програма має лише один клас
### 2.3 Важливі фрагменти програми:
- Цикл для підстановки заданного слова у кожне слово рядка
~~~java
for (int i = 0; i < text.length; i++) {
            if (text[i].length() >= k) {
                text[i] = text[i].substring(0, k - 1) + word + text[i].substring(k);
            }
        }
~~~
## Варіанти використання
Заміна кожного елемента слова, у тексті, заданим словом
## Висновки
У ході виконання лабораторної роботи я навчився працювати з StringBuilder
