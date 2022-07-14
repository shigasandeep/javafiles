/*Question 4: Write a program to map jbdc resultset to List of Student Objects.
 Filter the List of student objects based on their age  by using java8 streams and also without streams separately*/
 
 
class Student {
	private Integer id;
	private String name;
	private Integer age;
	Student(String id,String name, Integer age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
  
}

class JDBCResultSet {
	public static void main(String arg[]) {
		List<Student> studentList = new ArrayList();
		Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres", "admin@123");  

		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select id,name,age from student");
		while(rs.next()) {
		   studentList.add(new Student(rs.getInt(1), rs.getString(2), rs.getInt(3));
		}
		
		
		studentList.stream().filter(s->s.getAge()>24).forEach(s->System.out.println(s.getName+" "+s.getAge()));
		
		for (Student s: studentList) {
		     if (s.getAge()>24) {
				System.out.println(s.getName+" "+s.getAge());
			 }
		}
	}
}