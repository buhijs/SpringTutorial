package jdbcDemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl {
	
	
	@Autowired
	private DataSource dataSource;
	


	
	public Circle getCircle(int circleId) {
		Circle circle=null;
		Connection conn=null;
		try
		{
			
		conn=dataSource.getConnection();
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
			System.out.println(e);
		}
		return circle;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}