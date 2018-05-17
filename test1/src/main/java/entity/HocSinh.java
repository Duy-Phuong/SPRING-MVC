package entity;

public class HocSinh {
	public String getName() {
		return name;
	}

	public HocSinh(String name) {
		super();
		this.name = name;
	}
	public HocSinh() {
		
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public void getInfo() {
		System.out.println("Thong bao tu hoc sinh");
	}
	
}
