package jdbc;

import java.sql.*;
import java.util.Scanner;
public class Table_creation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String pass="Akhilesh@123";
		String query="create table amma(sno int,name varchar(255))";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		try(Connection conn=DriverManager.getConnection(url, user, pass);
				Statement st=conn.createStatement()){
			st.executeUpdate(query);
			System.out.println("Table updated successfully");
		
		
			String Query="insert into amma(sno,name) values(?,?)";
			PreparedStatement str=conn.prepareStatement(Query);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of rows");
			int count =sc.nextInt();
			for(int i=1;i<=count;i++) {
				System.out.println("Enter the rollno ");
				int roll=sc.nextInt();
				System.out.println("Name :");
				String name=sc.next();
				
				str.setInt(1, roll);
				str.setString(2, name);
				int result=str.executeUpdate();
				System.out.println("row is created successfully :"+result);
			}
			System.out.println("All data inserted Successfully ");
			
			
				String qu="select * from amma";
				Statement strr=conn.createStatement();
				ResultSet rs=strr.executeQuery(qu);
				while(rs.next()) {
					System.out.println(rs.getInt(1)+""+rs.getString(2));
				
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
