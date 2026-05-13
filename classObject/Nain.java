class Nain{
	
	public static void main(){
	Student.col_name = "Lovely professional University";
	Student s1 = new Student();

	s1.name = "Harsh Kumar";
	s1.roll_no = 27;
	s1.regd_no = 12345;
	s1.email = "harshkr2134@gmail.com"; 
	s1.cgpa = 7.8;
	
	s1.detail();
	Student s2 = new Student();

	s2.name = "Kumar";
	s2.roll_no = 7;
	s2.regd_no = 145;
	s2.email = "hakr2134@gmail.com"; 
	s2.cgpa = 7.8;

	s2.detail();

	}

}