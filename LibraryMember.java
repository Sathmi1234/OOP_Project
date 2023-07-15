class LibraryMember {
    private String memberID;
    private String name;
	
	LibraryMember(){
		
	}
	
    LibraryMember(String memberID, String name) {
        this.memberID = memberID;
        this.name = name;
    }
	
	public String getMemberID(){
		return memberID;
	}
	
	public void setMemberID(String memberID){
		this.memberID = memberID;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

    public void displayMemberDetails() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Name: " + name);
		System.out.println();
    }
}