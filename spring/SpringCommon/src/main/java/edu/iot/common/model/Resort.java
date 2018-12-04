package edu.iot.common.model;

import java.util.List;

import lombok.Data;

@Data
//@AllArgsConstructor
public class Resort {
	private long		resortId;
	private String		region;
	private String		type;
	private String		name;
	private String		address;
	private String		room;
	private String		phoneNumber;
	List<String> 		imageList;
}
