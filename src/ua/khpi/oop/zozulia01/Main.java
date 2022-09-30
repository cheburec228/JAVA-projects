package ua.khpi.oop.zozulia01;


/**
 * Завдання: Обрати тип змінних та встановити за допомогою констант та літералів початкові значення.
 * Використовуючи десятковий запис цілочисельного значення кожної змінної знайти і підрахувати кількість парних і непарних цифр.
 * Використовуючи двійковий запис цілочисельного значення кожної змінної підрахувати кількість одиниць.
 *
 * @author Zozulia Vyacheslav KN-921V
 *
 * @Version 1.0
 */
public class Main {

	static int decentNumber = 0x0004;
	
	/** Mobile phone number */
    static long phoneNumber = 380662234519L; 
    
    /** The last two non-zero digits in the phone number */
    static int twoNumbers = 0b11001;
    
    /** The last four non-zero digits of the phone number */
    static int fourLastNumber = 10647;
    
    /** determine the increased by one value of the remainder from dividing by 26 the decreased by one student number in the group log */
    static int someStud = ((4 - 1) % 26) + 1;
    
    /** A letter from the alphabet corresponding to a number from the last task */
    static char Letter = 'D';
    
    /**
     * Counts odd numbers
     * @return number of odd
     * @param  a set of numbers from which odd numbers will be counted */

    static int oddCount(long... value) {
        int oddCount = 0;
        for (int i = 0; i < value.length; i++)
            if (value[i] % 2 == 0)
                oddCount++;
        return oddCount;
    }
    
    /**
     * Counting units
     * @return the number of units
     * @param a set of numbers from which units will be counted */

    static int oneCount(long... value) {
        int oneCount = 0;
        for (int i = 0; i < value.length; i++) {
            while (value[i] != 0) {
                if (value[i] % 2 != 0)
                    oneCount++;
                value[i] /= 2;
            }
        }
        return oneCount;
    }
    

    /** Entry point */

	public static void main(String... args) {
        System.out.println("Непарні: " + oddCount(decentNumber, phoneNumber,twoNumbers, fourLastNumber, someStud, Letter));
        System.out.println("Одиниці: " + oneCount(decentNumber, phoneNumber,twoNumbers, fourLastNumber, someStud, Letter));
	}

}