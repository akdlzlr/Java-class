package edu.iot.controller_test.model;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Member {

	LoginType loginType;
	List<String> favorites;
	boolean agreement;
	
	
	@NotEmpty(message="필수 항목입니다.")
	@Length(min=4,message="사용자 ID는 최소 4글자 입니다.")
	private String userId;
		
	@NotEmpty(message="필수 항목입니다.")
	@Length(min=6,message="비밀번호는 최소 6글자 입니다.")
	private String password;
	
	@Email(message="email 양식과 일치하지 않습니다.")
	private String email;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
}


