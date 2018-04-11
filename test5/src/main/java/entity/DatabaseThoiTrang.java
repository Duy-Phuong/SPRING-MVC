package entity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mysql.cj.api.xdevapi.RowResult;

@Repository
public class DatabaseThoiTrang {

	 private JdbcTemplate jdbcTemplate;
//tự động tìm đến thằng có id là dataSource
	    @Autowired
	    public void setDataSource(DataSource dataSource) {
	        this.jdbcTemplate = new JdbcTemplate(dataSource);
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
}
