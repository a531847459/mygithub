package cn.mldn.myspring.di.vo;

public class Car {
	private String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Car [cname=" + cname + "]";
	}
	
}
