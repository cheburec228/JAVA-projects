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
- 
  
### 2.1 Засоби ООП
- Java code convention
- JDK:
- Ітератор
### 2.2 Ієрархія та структура класів
- 1. Main
- 2. vacancies

### 2.3 Важливі фрагменти програми:
- Занесення у класс інформацію
~~~java
    public void setName(final String value) {
        this.name = value;
    }

    public void setCompany(final String value) {
    	this.company = value;
    }
    public void setWorkingСonditions(final String value) {
    	this.WorkingСonditions = value;
    }
    public void setEarn(final int value) {
    	this.Earn = value;
    }
    public void setTerms(final List list) {
    	this.Terms = list;
    }
~~~
- Отримання інформації
~~~java
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public String getWorkingСonditions() {
    	return WorkingСonditions;
    }
    public int getEarn() {
    	return Earn;
    }
    public List getTerms() {
        return Terms;
    }
~~~
## Варіанти використання
Демонстрація роботи ООП 
## Висновки
У ході лабороторної роботи навчився використовувати об'єктно-орієнтований підхід для розробки об'єкта предметної (прикладної) галузі.
