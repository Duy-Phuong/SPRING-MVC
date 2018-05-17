package entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SinhVien {
	//@Autowired
	private GiamDoc giamdoc;
	private Address address;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(address != null) {
			return "Sinhvien["+ giamdoc.getChucvu()+ " -dia chi " + address.getAddress()+ "]";

		}else {
			return "Sinhvien["+ giamdoc.getChucvu()+ " ]";
		}
	}
	//@Autowired
	public SinhVien(GiamDoc giamdoc) {
		super();
		this.giamdoc = giamdoc;
	}
	
	public SinhVien() {
		
	}

	public GiamDoc getGiamdoc() {
		return giamdoc;
	}
	@Autowired
	public void setGiamdoc(GiamDoc giamdoc) {
		this.giamdoc = giamdoc;
	}
	public Address getAddress() {
		return address;
	}
	
	@Autowired(required=false)
	@Qualifier("address2")
	public void setAddress(Address address) {
		this.address = address;
	}
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
}
