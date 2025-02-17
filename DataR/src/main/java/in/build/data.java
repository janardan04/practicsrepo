package in.build;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Result;

//import org.eclipse.jdt.internal.compiler.batch.Main;

public class data {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		PreparedStatement ps= con.prepareStatement("select * from register");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			String name1= rs.getString("name");
			String email1=rs.getString("email");
			String password1= rs.getString("password");
			String gender= rs.getString("gender");
			String city= rs.getString("city");
			System.out.println("name :" +name1);
			System.out.println("email :" +email1);
			System.out.println("password :" +password1);
			System.out.println("gender :" +gender);
			System.out.println("city :" +city);
			System.out.println("-------------------------------");
		}
		con.close();
	}
}
