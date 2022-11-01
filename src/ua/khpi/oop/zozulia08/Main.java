package ua.khpi.oop.zozulia08;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner scanner;
	public static void main(final String[] arguments) {
        final books book_1 = new books();
        
        ArrayList<String> autors = new ArrayList<String>();
        
        // Initialize an ArrayList with add()
        autors.add("Стівен Кінг");

        
        book_1.setISBN("978-617-12-8599-6");
        book_1.setName("Темна Вежа VI. Пісня Сюзанни");
        book_1.setPublishing("Книжковий клуб \"Клуб Сімейного Дозвілля\"");
        book_1.setGenre("Фантастика");
        book_1.setDate(2021);
        book_1.setAutors(autors);
        
        final books book_2 = new books();
        
        ArrayList<String> autors1 = new ArrayList<String>();
        
        // Initialize an ArrayList with add()
        autors1.add("Масао Китами");

        
        book_2.setISBN("978-617-7561-21-6");
        book_2.setName("Самурай без меча - Масао Китами");
        book_2.setPublishing("Book Chef");
        book_2.setGenre("Фантастика");
        book_2.setDate(2019);
        book_2.setAutors(autors1);
        
        
        List<books> list = new ArrayList<>();
        list.add(book_1);
        list.add(book_2);
        
        FullBooks full = new FullBooks();
        full.setBooks(list);
        	
        scanner = new Scanner(System.in);
        System.out.print("Entry path: ");
		String path = scanner.nextLine();

       
        try {
			XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(path + ".xml")));
			x.writeObject(full);
			x.close();
			System.out.println("Done");
        } catch (FileNotFoundException e) {
		
			e.printStackTrace();
			System.out.println("Error");
		}
        
        
    }

}