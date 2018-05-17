package entity;

public class GiamDoc extends NhanVien{
	private String chucvu;

	public GiamDoc(String name, String tuoi, String chucvu) {
		super(name, tuoi);
		this.chucvu = chucvu;
	}
	public GiamDoc() {
		
	}

	public String getChucvu() {
		return chucvu;
	}

	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	
}
