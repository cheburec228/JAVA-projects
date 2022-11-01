# 7. Об'єктно-орієнтована декомпозиція
## Тема
- Використання об'єктно-орієнтованого підходу для розробки об'єкта предметної (прикладної) галузі.

## 1. Вимоги
- Використовуючи об'єктно-орієнтований аналіз, реалізувати класи для представлення сутностей відповідно прикладної задачі - domain-об'єктів.

- Забезпечити та продемонструвати коректне введення та відображення кирилиці.

- Продемонструвати можливість управління масивом domain-об'єктів.
### 1.1 Розробник
- Зозуля Вячеслав Олегович
- КН-921В
- 4 варіант

### 1.2 Загальне завдання
- Розробити прогрму 
- Оформити роботу


### 1.3 Задача
4. Бібліотека∗
Дані про книгу: ISBN; назва; автори (кількість не обмежена); видавництво; жанр; дата видання.

## 2. Вивід у консоль
- ![image](https://user-images.githubusercontent.com/67918913/199192298-fcd761b6-8587-4a73-ac0f-12a62668e904.png)
  
### 2.1 Засоби ООП
- Java code convention
- JDK:
- Ітератор
### 2.2 Ієрархія та структура класів
- 1. Main
- 2. books

### 2.3 Важливі фрагменти програми:
- Занесення у класс інформацію
~~~java
    public void setISBN(final String value) {
	        this.ISBN = value;
	    }
	    public void setName(final String value) {
	        this.name = value;
	    }
	    public void setPublishing(final String value) {
	        this.publishing = value;
	    }
	    public void setGenre(final String value) {
	        this.genre = value;
	    }
	    public void setDate(final int value) {
	    	this.date = value;
	    }
	    public void setAutors(final List list) {
	    	this.Autors = list;
	    }
~~~
- Отримання інформації
~~~java
    public String getISBN() {
	        return ISBN;	
	    }
	    public String getName() {
	        return name;	
	    }
	    public String getPublishing() {
	        return publishing;	
	    }
	    public String getGenre() {
	        return genre;	
	    }
	    public int getDate() {
	    	return date;
	    }
	    public List getAutors() {
	        return Autors;
	    }
~~~
## Варіанти використання
Демонстрація роботи ООП 
## Висновки
У ході лабороторної роботи навчився використовувати об'єктно-орієнтований підхід для розробки об'єкта предметної (прикладної) галузі.
