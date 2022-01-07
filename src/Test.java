import java.sql.*;
public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rohith","root","");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from anand");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			st.close();
			con.close();
		}catch(Exception e) {
			
		}

	}

}