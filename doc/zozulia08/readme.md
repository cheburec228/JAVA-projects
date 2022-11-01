# 8. Основи введення/виведення Java SE
## Тема
- Оволодіння навичками управління введенням/виведенням даних з використанням класів платформи Java SE.

## 1. Вимоги
1. Забезпечити можливість збереження і відновлення масива об'єктів рішення завдання лабораторної роботи №7.

2. Забороняється використання стандартного протокола серіалізації.

3. Продемонструвати використання моделі Long Term Persistence.

4. Забезпечити діалог з користувачем у вигляді простого текстового меню.

5. При збереженні та відновленні даних забезпечити діалоговий режим вибору директорії з відображенням вмісту і можливістю переміщення по підкаталогах.
### 1.1 Розробник
- Борисов Ілля Володимирович
- КН-921в
- 2 варіант

### 1.2 Загальне завдання
- Розробити прогрму 
- Оформити роботу

### 1.3 Задача
4. Бібліотека∗
Дані про книгу: ISBN; назва; автори (кількість не обмежена); видавництво; жанр; дата видання.

## 2. Вивід у консоль
~~~bash
Entry path: C:\Users\Vyacheslav\eclipse-workspace\zozulia-vyacheslav\src\ua\khpi\oop\zozulia08\books
Done
~~~
- ![image](https://user-images.githubusercontent.com/67918913/199194190-be3974ae-5895-4cf6-bae6-d0c5c59ffd06.png)
- ![image](https://user-images.githubusercontent.com/67918913/199194255-3ce2653d-7d2f-4d85-9e74-4af20c7e5980.png)
### 2.1 Засоби ООП
- Java code convention
- JDK:
- ООП
### 2.2 Ієрархія та структура класів
- 1. Main
- 2. FullBooks
- 3. books

### 2.3 Важливі фрагменти програми:
- Введення пасу сейвінгу xml
~~~java
scanner = new Scanner(System.in);
System.out.print("Entry path: ");
String path = scanner.nextLine();
~~~
- Генерація XML
~~~java
try {
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(path + ".xml")));
			x.writeObject(full);
			x.close();
			System.out.println("Done");
        } catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error");
		}
~~~
## Варіанти використання
Демонстрація роботи ООП 
## Висновки
У ході лабороторної роботи навчився використовувати об'єктно-орієнтований підхід для розробки об'єкта предметної (прикладної) галузі.
