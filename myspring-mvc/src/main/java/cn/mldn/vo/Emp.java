package cn.mldn.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Emp implements Serializable{
	private String ename;
	private Double sal;
	private Integer age;
	private Date birthday;
	private Dept dept;
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Dept getDept() {
		return dept;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", sal=" + sal + ", age=" + age + ", birthday=" + birthday + ", dept=" + dept
				+ "]";
	}
	
}
