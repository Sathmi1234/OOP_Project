abstract class LibraryItem{
	public String title;
	public String itemID;
	
	LibraryItem(){
		
	}
	LibraryItem(String title, String itemID){
		this.title = title;
		this.itemID = itemID;
	}
	public void checkOut(){
		System.out.println();
		System.out.println("Checked Out");
		System.out.println();
	}
	
	public void checkIn(){
		System.out.println("Checked In");
		System.out.println();
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getItemID(){
		return itemID;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setItemID(String itemID){
		this.itemID = itemID;
	}
	
	abstract public void displayItemDetails();
}