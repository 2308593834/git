package org.ssha.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Guess {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer gid;
	private String gname;
	private String sms;
	@ManyToOne
	private Demo demo;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	public Demo getDemo() {
		return demo;
	}
	public void setDemo(Demo demo) {
		this.demo = demo;
	}
	@Override
	public String toString() {
		return "Guess [gid=" + gid + ", gname=" + gname + ", sms=" + sms + ", demo=" + demo + "]";
	}

	
	
}
