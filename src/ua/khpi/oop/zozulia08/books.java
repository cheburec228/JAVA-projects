package ua.khpi.oop.zozulia08;
import java.util.List;
import java.io.Serializable;

public class books implements Serializable{
	
	
		private String ISBN = null;
	    private String name = null;
	    private String publishing = null;
	    private String genre = null;

	    private int date;
	    private List Autors;
	    
	    
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
	    
	    @Override
	    public String book() {
	    	return "ISBN:"+ ISBN + "\nName: " + name  + "\nPublishing: " + publishing + "\nGenre: " + genre + "\nDate: " + date + "\nAutors: "+ Autors;
	    }
	
}
