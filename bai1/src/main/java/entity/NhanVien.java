package entity;

import java.util.List;

public class NhanVien {
private String name;
private String tuoi;
private GiamDoc doc;
private List<GiamDoc> listGiamDoc;
public List<GiamDoc> getListGiamDoc() {
	return listGiamDoc;
}
public void setListGiamDoc(List<GiamDoc> listGiamDoc) {
	this.listGiamDoc = listGiamDoc;
}
public GiamDoc getDoc() {
	return doc;
}
public void setDoc(GiamDoc doc) {
	this.doc = doc;
}
public NhanVien(String name, String tuoi) {
	this.name = name;
	this.tuoi = tuoi;
}
public NhanVien() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTuoi() {
	return tuoi;
}
public void setTuoi(String tuoi) {
	this.tuoi = tuoi;
}
@Override
public String toString() {
	String str = "NhanVien[-name: "+ name + " - tuoi: " + tuoi + " - giamdoc: " + doc.getChucvu() + "]";
	return str;
}
public void Say() {
	System.out.println("name: "+ name + " tuoi: " + tuoi);
}

public static NhanVien createNV() {
	NhanVien nv =  new NhanVien();
	nv.setName("");
	return nv;
}
public void Xuat() {
	System.out.println("list giam doc inner bean");
	for(GiamDoc doc : listGiamDoc) {
		System.out.println("chuc vu: " + doc.getChucvu());
	}
}
}
