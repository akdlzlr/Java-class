package edu.iot.controller_test.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class Board {
	
	@NotEmpty(message="필수 항목입니다.")
	private String title;
	
	@NotEmpty(message="필수 항목입니다.")
	private String writer;
	
	@NotEmpty(message="필수 항목입니다.")
	@Length(min=50,message="본문 내용은 최소 50자 이상입니다.")
	private String content;
}
