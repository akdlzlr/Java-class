package edu.iot.capricorn.model;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Top100 {

	private long 		id;
	private String 		title;
	private String 		region;
	private String 		location;
	private String 		content;
	private String 		address;
	private String 		homePage;
	private Date 		regDate;
	private Date 		updateDate;
	List<String>		imageList;
	
	public String getSummary() {
		return content.substring(0, 20)+"...";
	}
	//	jsp에서 el형식으로 ${i.summary}으로 사용할수 있다.
}
