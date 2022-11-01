# 5. Розробка власних контейнерів. Ітератори
## Тема
- Набуття навичок розробки власних контейнерів.
- Використання ітераторів.

## 1. Вимоги
- Розробити клас-контейнер, що ітерується для збереження початкових даних завдання л.р. №3 у вигляді масиву рядків з можливістю додавання, видалення і зміни елементів.
- В контейнері реалізувати та продемонструвати наступні методи:

  - String toString() повертає вміст контейнера у вигляді рядка;
  - void add(String string) додає вказаний елемент до кінця контейнеру;
  - void clear() видаляє всі елементи з контейнеру;
  - boolean remove(String string) видаляє перший випадок вказаного елемента з контейнера;
  - Object[] toArray() повертає масив, що містить всі елементи у контейнері;
  - int size() повертає кількість елементів у контейнері;
  - boolean contains(String string) повертає true, якщо контейнер містить вказаний елемент;
  - boolean containsAll(Container container) повертає true, якщо контейнер містить всі елементи з зазначеного у параметрах;
  - public Iterator<String> iterator() повертає ітератор відповідно до Interface Iterable.
- В класі ітератора відповідно до Interface Iterator реалізувати методи:

  - public boolean hasNext();
  - public String next();
  - public void remove().
- Продемонструвати роботу ітератора за допомогою циклів while и for each.
### 1.1 Розробник
- Зозуля Вячеслав Олегович
- КН-921В
- 4 варіант

### 1.2 Загальне завдання
- Розробити прогрму 
- Оформити роботу

### 1.3 Задача
див. у 1

## 2. Вивід у консоль
- ![image](https://user-images.githubusercontent.com/67918913/199188598-b287f017-fc5d-46c7-8990-ce2ab4c0d5aa.png)
  
### 2.1 Засоби ООП
- Java code convention
- JDK:
- Ітератор
### 2.2 Ієрархія та структура класів
- 1. Main

### 2.3 Важливі фрагменти програми:
- Сортировка за алфавітом
~~~java
//String toString()
			System.out.println("toString():" + arrayList1.toString());
			//void add(String string)
		    System.out.println("add(String string):" + arrayList1.add("неизменяемым"));
		    
		    //boolean remove(String string)
		    System.out.println("remove(String string):" + arrayList1.remove("String"));
		    
		    //Object[] toArray()
		    // Create an array from the ArrayList
		    String Arraylist_2[] = new String[arrayList1.size()];
		    Arraylist_2 = arrayList1.toArray(Arraylist_2);
		    arrayList1.toArray(Arraylist_2);
		    for (String item : Arraylist_2) {
		        System.out.println("Item in Object[] toArray() = " + item);
		    }
		    //int size()
		    System.out.println("size():" + arrayList1.size());
		    
		    //boolean contains(String string)
		    System.out.println("contains(String string):" + arrayList1.contains("обьект"));
		    
		    //boolean containsAll(Container container) 
		    //Creating another empty List
		    List<String> listTemp = new ArrayList<String>();
	        listTemp.add("до");
	        listTemp.add("определённого");
	        listTemp.add("времени");
		    System.out.println("containsAll(Container container):" + arrayList1.contains(listTemp));
		    
		    String fordel = "является";
		    String Word;
		    
		    Iterator<String> iterator = arrayList1.iterator();
		   
		    while(iterator.hasNext()) {
		    	Word = iterator.next();
		    	System.out.println("Iterator has next, word is - " + Word);
		    	if (fordel.equals(Word)) {
		    		iterator.remove();
		    		System.out.println("Word '" + Word + "' was be deleted");
		    	}
		    }
~~~
## Варіанти використання
Демонстрація роботи ітератора 
## Висновки
На цій лабораторній роботі навчились працювати з ітератором
