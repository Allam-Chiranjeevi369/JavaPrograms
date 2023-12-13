package DemoJDBC.MavenProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo{
	
  public static void main(String[] args){
	  
	  String url = "jdbc:mysql:///employeedetails";
	  String user = "root";
	  String password = "root";
	  
	  try {
		  
		  Connection con = DriverManager.getConnection(url, user, password);
		  
		  Statement st = con.createStatement();
		  
		  ResultSet rs = st.executeQuery("SELECT * FROM employee");
		  
		  while(rs.next()) {
			  
			  System.out.println(rs.getInt(1)+" "+ rs.getString(2) +" "+ rs.getString(3));
			  
		  }
		  
		  con.close();
		  
	  }catch(Exception e) {
		  
		  e.printStackTrace();
		  
	  }
		  
  }
}