class UserDefinedConstructor{
	final int regd_no;
	String name;

	UserDefinedConstructor(int regd_no){
		this.regd_no = regd_no;
	}
	UserDefinedConstructor(int regd_no,String name){
		this.regd_no = regd_no;
		this.name = name;

	}
	void details(){
		System.out.println("Registration number: "+regd_no);
		System.out.println("name: "+name);

	}
}