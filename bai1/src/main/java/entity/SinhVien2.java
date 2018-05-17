package entity;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SinhVien2 {
		int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		private GiamDoc doc;
		private Address address;
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			if(address != null) {
				return "Sinhvien["+ doc.getChucvu()+ " -dia chi " + address.getAddress()+ " -tuoi = "+ id + "]";

			}else {
				return "Sinhvien["+ doc.getChucvu()+ " -tuoi = "+ id + "]";
			}
		}
		//@Autowired
		public SinhVien2(GiamDoc doc) {
			super();
			this.doc = doc;
		}
		
		public SinhVien2() {
			
		}

		public GiamDoc getGiamdoc() {
			return doc;
		}
		@Resource(name="doc")
		public void setGiamdoc(GiamDoc doc) {
			this.doc = doc;
		}
		public Address getAddress() {
			return address;
		}
		
		@Resource(name="address2")
		public void setAddress(Address address) {
			this.address = address;
		}

}
