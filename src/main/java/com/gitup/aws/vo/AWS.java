package com.gitup.aws.vo;

import org.apache.ibatis.type.Alias;

@Alias("aws")
public class AWS {
	private Integer atnum;
	private String atname;
	private Integer atage;
	public Integer getAtnum() {
		return atnum;
	}
	public void setAtnum(Integer atnum) {
		this.atnum = atnum;
	}
	public String getAtname() {
		return atname;
	}
	public void setAtname(String atname) {
		this.atname = atname;
	}
	public Integer getAtage() {
		return atage;
	}
	public void setAtage(Integer atage) {
		this.atage = atage;
	}
	@Override
	public String toString() {
		return "AWS [atnum=" + atnum + ", atname=" + atname + ", atage=" + atage + "]";
	}
	
	
}
