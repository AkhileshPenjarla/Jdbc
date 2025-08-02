package jdbc;

import java.sql.*;
public class Jdbc_createtable {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String pass="Akhilesh@123";
		String query="create table laxman(id int,name varchar(255))";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,user,pass);
			Statement sta=conn.createStatement();
			int rs=sta.executeUpdate(query); //0
			
			System.out.println(rs);
			System.out.println("Table created successfully");
			
		

	}

}
