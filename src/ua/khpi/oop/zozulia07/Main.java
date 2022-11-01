package ua.khpi.oop.zozulia07;

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
        final books books = new books();
        
        ArrayList<String> autors = new ArrayList<String>();
        
        // Initialize an ArrayList with add()
        autors.add("Стівен Кінг");

        
        books.setISBN("978-617-12-8599-6");
        books.setName("Темна Вежа VI. Пісня Сюзанни");
        books.setPublishing("Книжковий клуб \"Клуб Сімейного Дозвілля\"");
        books.setGenre("Фантастика");
        books.setDate(2021);
        books.setAutors(autors);
        
        System.out.print(books.getISBN() 
        		+ "\n" 
        		+ books.getName() 
        		+ "\n"
        		+ books.getPublishing() 
        		+ "\n"
        		+ books.getGenre() 
        		+ "\n"
        		+ books.getDate() + " год"
        		+ "\n" 
        		+ books.getAutors());
    }

}