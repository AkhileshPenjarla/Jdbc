package jdbc;

import java.sql.*;
public class jdbc_insertdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String pass="Akhilesh@123";
		String query="insert into laxman(id,name) values(?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try(Connection con=DriverManager.getConnection(url,user,pass);
					PreparedStatement str=con.prepareStatement(query)){
				str.setInt(1, 7473);
				str.setString(2,"Akhilesh");	
				str.executeUpdate();
				System.out.println("updated in table");
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
