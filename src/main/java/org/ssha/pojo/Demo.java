package org.ssha.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Demo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer did;
	private String dname;
	private String dmess;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDmess() {
		return dmess;
	}
	public void setDmess(String dmess) {
		this.dmess = dmess;
	}
	@Override
	public String toString() {
		return "Demo [did=" + did + ", dname=" + dname + ", dmess=" + dmess + "]";
	}
	
	
	
}
