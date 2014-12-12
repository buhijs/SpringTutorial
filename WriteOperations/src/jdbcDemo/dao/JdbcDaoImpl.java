package jdbcDemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl {



	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();


	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

	public int getCircleCount(){
		String sql="SELECT COUNT(*) FROM CIRCLE";
		//jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate.queryForInt(sql);
	}

	public Circle getCircleName(int ID){
		String sql="SELECT * FROM CIRCLE WHERE ID = ?";
		return jdbcTemplate.queryForObject(sql,new Object[]{ID},new CircleMapper());
	}
	
	public List<Circle> getAllCircles(){
		String sql="SELECT * FROM CIRCLE";
		return this.jdbcTemplate.query(sql, new CircleMapper());
	}

	public static final class CircleMapper implements RowMapper<Circle>{

		@Override
		public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Circle circle=new Circle();
			circle.setId(resultSet.getInt("ID"));
			circle.setName(resultSet.getString("name"));
			return circle;
		}
	

	}
	
	public void insertCircle( Circle circle){
		String sql="INSERT INTO CIRCLE(id,name) values(?,?)";
		this.jdbcTemplate.update(sql,new Object[] {circle.getId(),circle.getName()});
	}
	
	public void createTable(){
		String sql="CREATE TABLE CIRCLE(ID INTEGER, NAME VARCHAR(50))";
		this.jdbcTemplate.execute(sql);
	}


}