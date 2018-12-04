package edu.iot.common.model;

import lombok.Data;

@Data
public class Search {

	private String category;
	private String keyword;
	
	private String lgType;
	private String mdType;
	private String smType;
	
	public void setKeyword(String keyword) {
		this.keyword="%"+keyword+"%";
	}
	
	public void setmdType(String mdType) {
		this.mdType=mdType+"%";
	}
	public void setsmType(String smType) {
		this.smType=smType+"%";
	}
}
