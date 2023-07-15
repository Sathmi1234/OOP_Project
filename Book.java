class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	Book(){
		
	}
	Book(String title,String itemID, String author, int numPages){
		super(title, itemID);
		this.author = author;
		this.numPages = numPages;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public int getNumPages(){
		return numPages;
	}
	
	public void setNumPages(int numPages){
		this.numPages = numPages;
	}
	
	public void displayItemDetails(){
		System.out.println("Book Title: " + title);
		System.out.println("Book ID: " + itemID);
		System.out.println("Author: " + author);
		System.out.println("Number of Pages: " + numPages);
		System.out.println();
		
	}
}