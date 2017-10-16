package cn.mldn.myspring.di.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@SuppressWarnings("serial")
public class Emp implements Serializable {
	private Long deptno;
	private String name;
	private Date hirdate;
	private Double sal;
	private List<Car> car;
	private List<String> infos;
	private Set<String> msgs;
	private Map<Integer,String> fcs;
	private Boolean enable;
	private Properties pro;
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	public Boolean getEnable() {
		return enable;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}
	public Properties getPro() {
		return pro;
	}
	public void setFcs(Map<Integer, String> fcs) {
		this.fcs = fcs;
	}
	public Map<Integer, String> getFcs() {
		return fcs;
	}
	public void setMsgs(Set<String> msgs) {
		this.msgs = msgs;
	}
	public Set<String> getMsgs() {
		return msgs;
	}
	public void setCar(List<Car> car) {
		this.car = car;
	}
	public List<Car> getCar() {
		return car;
	}
	public void setInfos(List<String> infos) {
		this.infos = infos;
	}
	public List<String> getInfos() {
		return infos;
	}
	public Long getDeptno() {
		return deptno;
	}
	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getHirdate() {
		return hirdate;
	}
	public void setHirdate(Date hirdate) {
		this.hirdate = hirdate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [deptno=" + deptno + ", name=" + name + ", hirdate=" + hirdate + ", sal=" + sal + ", car=" + car
				+ ", infos=" + infos + ", msgs=" + msgs + ", fcs=" + fcs + ", enable=" + enable + ", pro=" + pro + "]";
	}

	
}
