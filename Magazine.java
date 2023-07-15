class Magazine extends LibraryItem{
	private String issueDate;
	private String publisher;
	
	Magazine(){
		
	}
	Magazine(String title,String itemID, String issueDate, String publisher){
		super(title, itemID);
		this.issueDate = issueDate;
		this.publisher = publisher;
	}
	
	public String getIssueDate(){
		return issueDate;
	}
	
	public void setIssueDate(String issueDate){
		this.issueDate = issueDate;
	}
	
	public String getPublisher(){
		return publisher;
	}
	
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	
	public void displayItemDetails(){
		System.out.println("Magazine Title: " + title);
		System.out.println("Magazine ID: " + itemID);
		System.out.println("Issue Date: " + issueDate);
		System.out.println("Publisher: " + publisher);
		System.out.println();
	}
}