package ua.khpi.oop.zozulia06;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Replace_text implements Serializable{

	public static void replace () {
		
		    String[] text = "При работе со строками важно понимать, что объект String является ".split(" ");
	        
		    ArrayList<String> arrayList1 = new ArrayList<> (); 
		     for(String subStr:text) {
		    	 arrayList1.add(subStr);
		     }  
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
		    

		}
}
