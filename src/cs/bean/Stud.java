package cs.bean;

public class Stud {
	private int id ;
	private String name;
	private  String mobno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public void display() {
	System.out.println("ID : " + getId());
    System.out.println("Name : " + getName());
    System.out.println("Mobile No : " + getMobno());
	}
}
