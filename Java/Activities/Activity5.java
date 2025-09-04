package activities;

	abstract class Book {
	    String title;

	    public abstract void setTitle(String s);

	    public String getTitle() {
	        return title;
	    }
	}
	class MyBook extends Book {
	    public void setTitle(String s) {
	        title = s;
	    }
	}

	
	public class Activity5 {
	    public static void main(String[] args) {
	
	        Book newNovel = new MyBook();   

	        newNovel.setTitle("Java Programming Guide");

	        System.out.println("The title is: " + newNovel.getTitle());
	    }
	}


