package entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Columns;

@Entity(name="chucvu")
public class ChucVu {
	//dat ten cac thuoc tinh co tenn giong voi bang
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idchucvu;
	String tenchucvu;
	
	public ChucVu() {
		
	}
	
	public int getIdchucvu() {
		return idchucvu;
	}
	public void setIdchucvu(int idchucvu) {
		this.idchucvu = idchucvu;
	}
	public String getTenchucvu() {
		return tenchucvu;
	}
	public void setTenchucvu(String tenchucvu) {
		this.tenchucvu = tenchucvu;
	}
}
