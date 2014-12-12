package jdbcDemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbcDemo.model.Circle;

public class JdbcDaoImpl {

	public Circle getCircle(int circleId) {
		Circle circle=null;
		try
		{
		Connection conn=null;
		String driver="org.apache.derby.jdbc.ClientDriver";
		Class.forName(driver).newInstance();
		conn=DriverManager.getConnection("jdbc:derby://localhost:1527//db");
		PreparedStatement ps=conn.prepareStatement("SELECT * FROM circle");
		
	
				ResultSet rs = ps.executeQuery();
		if(rs.next())
			circle=new Circle(circleId, rs.getString("name"));
		rs.close();
		ps.close();
		conn.close();
		}
		catch(Exception e)
		{
			System.out.println("bla bla bla");
		}
		return circle;
	}
}