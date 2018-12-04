package edu.iot.jdbc_test.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class FamousSaying {
//	json 필드명과 아래 필드명이 같아야함
	private long id;
	private String statement;
	private String who;
	private Date regDate;
	private Date updateDate;
}
