package jdbc;
import java.sql.*;
public class jdbc_retriveelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost/student";
		String user="root";
		String pass="Akhilesh@123";
		String query="select * from laxman";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try(Connection conn=DriverManager.getConnection(url,user,pass);
					Statement st=conn.createStatement()){
				ResultSet rs=st.executeQuery(query);
				while(rs.next()) {
					int id=rs.getInt(1);
					String name=rs.getString(2);
					System.out.println(id+""+name);
				}
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
