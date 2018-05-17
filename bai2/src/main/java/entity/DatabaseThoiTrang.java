package entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.object.MappingSqlQueryWithParameters;
import org.springframework.stereotype.Repository;

import com.mysql.cj.api.xdevapi.RowResult;

@Repository
public class DatabaseThoiTrang {

	// private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate jdbcTemplate;
//tự động tìm đến thằng có id là dataSource
	    @Autowired
	    public void setDataSource(DataSource dataSource) {
	        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	    }
	 
	    public void layDanhSachNhanVien() {
	    	String sql = " select * from NhanVien ";
	    	List<NhanVien> list = jdbcTemplate.query(sql, new RowMapper<NhanVien>() {

				public NhanVien mapRow(ResultSet rowResult, int arg1) throws SQLException {
					// TODO Auto-generated method stub
					NhanVien nv=  new NhanVien();
					nv.tenNhanVien = rowResult.getString("name");
					nv.tuoi = rowResult.getInt("tuoi");
					return nv;
				}
	    		
	    	});
	    	
	    	for(NhanVien nv : list) {
	    		System.out.println("ten nv: " + nv.tenNhanVien + " - age: " + nv.tuoi);
	    	}
	    }
	    
	    public void layNhanVien(int id) {
	    	
	    	MapSqlParameterSource params =  new MapSqlParameterSource();//new MapSqlParameterSource("id", 13);
	    	params.addValue("id", 13);
	    	try {
	    	List<NhanVien> list = jdbcTemplate.query(" select * from NhanVien where id = :id",params, new RowMapper<NhanVien>() {

				public NhanVien mapRow(ResultSet rowResult, int arg1) throws SQLException {
					// TODO Auto-generated method stub
					NhanVien nv=  new NhanVien();
					nv.tenNhanVien = rowResult.getString("name");
					nv.tuoi = rowResult.getInt("tuoi");
					return nv;
				}
	    		
	    	});
	    	System.out.println("Lay nhan vien co id =  13");
	    	for(NhanVien nv : list) {
	    		System.out.println("ten nv: " + nv.tenNhanVien + " - age: " + nv.tuoi);
	    	}
	    	
	    	}catch(CannotGetJdbcConnectionException ex) {
	    		System.out.println(ex.getMessage());
	    	}catch(DataAccessException ex) {
	    		System.out.println(ex.getMessage());
	    	}
	    }
	    
	    public boolean delete(int id) {
	    	
	    	MapSqlParameterSource params =  new MapSqlParameterSource();//new MapSqlParameterSource("id", 13);
	    	params.addValue("id", 12);
	    	return jdbcTemplate.update( "delete from NhanVien where id = :id", params) == 1;
	    }
	    
	    public boolean create(NhanVien nv) {
	    	
	    	BeanPropertySqlParameterSource params =  new BeanPropertySqlParameterSource(nv);//new MapSqlParameterSource("id", 13);
	    	
	    	return jdbcTemplate.update( "insert into NhanVien(name, tuoi) values(:tenNhanVien, :tuoi)", params) == 1;
	    }
	    
	    public boolean update(NhanVien nv) {
	    	
	    	BeanPropertySqlParameterSource params =  new BeanPropertySqlParameterSource(nv);//new MapSqlParameterSource("id", 13);
	    	
	    	return jdbcTemplate.update( "update NhanVien set name = :tenNhanVien where tuoi=:tuoi", params) == 1;
	    }
}
