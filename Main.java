class Main{
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("The Catcher in the Rye");
		b1.setItemID("B001");
		b1.setAuthor("J.D. Salinger");
		b1.setNumPages(240);
        Book b2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
        Book b3 = new Book("1984", "B003", "George Orwell", 328);
        Book b4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
        Book b5 = new Book("The Hobbit", "B005", "J.R.R. Tolkien", 320);

        Magazine m1 = new Magazine();
		m1.setTitle("National Geographic");
		m1.setItemID("M001");
		m1.setIssueDate("August 2023");
		m1.setPublisher("National Geographic Society");
        Magazine m2 = new Magazine("Time", "M002", "September 2023", "Time USA, LLC");
        Magazine m3 = new Magazine("Forbes", "M003", "June 2023", "Forbes Media");
        Magazine m4 = new Magazine("Vogue", "M004", "July 2023", "Condé Nast");
        Magazine m5 = new Magazine("Sports Illustrated", "M005", "July 2023", "Maven Coalition");

        LibraryMember lm1 = new LibraryMember();
		lm1.setMemberID("L001");
		lm1.setName("John Doe");
        LibraryMember lm2 = new LibraryMember("L002", "Jane Smith");
        LibraryMember lm3 = new LibraryMember("L003", "David Johnson");
        LibraryMember lm4 = new LibraryMember("L004", "Sarah Williams");
        LibraryMember lm5 = new LibraryMember("L005", "Michael Brow");

        b1.checkOut();
        b1.displayItemDetails();
        b1.checkIn();
        b1.displayItemDetails();

		System.out.println("*****Book Details*****");
		System.out.println();
		
        b1.displayItemDetails();
        b2.displayItemDetails();
        b3.displayItemDetails();
        b4.displayItemDetails();
        b5.displayItemDetails();

		System.out.println("*****Magazine Details*****");
		System.out.println();
		
        m1.displayItemDetails();
        m2.displayItemDetails();
        m3.displayItemDetails();
        m4.displayItemDetails();
        m5.displayItemDetails();

		System.out.println("*****Library Member Details*****");
		System.out.println();
		
        lm1.displayMemberDetails();
        lm2.displayMemberDetails();
        lm3.displayMemberDetails();
        lm4.displayMemberDetails();
        lm5.displayMemberDetails();
    }
}