package ua.khpi.oop.zozulia02;
import java.util.Random;

/**
 * Завдання: Знайти позиції всіх найменших цифр в десятковому запису цілочисельного значення.
 *
 * @author Zozulia Vyazcheslav KN-921B
 *
 * @Version 1.0
 */

public class Main {
	
	static Random random = new Random();
	
	static int find(int number) {
		
		int position = 0, position1 = 0;
		int fixed = 0;
		int m = 0, m1 = 0;
		int copy = number, copy1 = number;
		while (copy >= 10) {
			copy /= 10;
			
			position++;
			m++;
		}
		m++;
		m1 = m;
		position++;
        position1 = position;
		int low = number % 10;
		fixed = m;
		while (m!=0) {
			if(number % 10 < low){
				low = number % 10;
				if(low == number % 10)
				    fixed = position;
			}

			number /= 10;
			position--;
			m--;
		}
		while (m1!=0) {
			if(copy1 % 10 < low){
				low = copy1 % 10;
			}
			if(position1 < fixed){
    			if(copy1 % 10 == low)
    			    System.out.print(position1 + " ");
			}
			copy1 /= 10;
			position1--;
			m1--;
		}
		return fixed;
	}
	
	/**
	 * Program Entry Point
	 *
	 * @param args command line parameters
	 */
	
	public static void main(String... args) {
		for(int i = 0; i < 10; i++){
	        int number = random.nextInt();
	        if(number < 0)
			    number *= -1;

	        System.out.println( "\n_________________________________________________________\n");
	        System.out.print("|#" + (i+1) +"| | Число: " + number + "| | Позиции наименьших цифр: ");
	        int position = find(number);
	        System.out.print(position + "|");
	        
	    }
		
	}
}