import java.sql.*;  
class Ex_sql
{  
	public static void main(String args[])
	{  
		try
		{  			
			Class.forName("com.mysql.cj.jdbc.Driver");  
			 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/db1","root","root");
						
			Statement stmt=con.createStatement();  
			
			ResultSet rs=stmt.executeQuery("select * from emp");  

			while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}  
}