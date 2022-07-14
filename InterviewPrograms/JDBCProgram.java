/*Q3: Write a jdbc program to explain usage of transactions */

import java.sql.*;  
class JDBCProgram {  
  public static void main(String args[])throws Exception{  
    Class.forName("org.postgresql.Driver");
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres", "admin@123");  
    con.setAutoCommit(false);  

    Statement stmt=con.createStatement();  
    stmt.executeUpdate("insert into student (id,name,age) values(1,'Sandeep',25)");  
    stmt.executeUpdate("insert into student (id,name,age) values(2,'Mam',23)");  
	stmt.executeUpdate("insert into student (id,name,age) values(3,'Uma',30)");

    con.commit();  
    con.close();  
  }
}  