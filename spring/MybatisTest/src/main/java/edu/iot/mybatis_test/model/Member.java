package edu.iot.mybatis_test.model;

import java.util.Date;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
	
	
	@NotEmpty(message="필수항목입니다.")
	@Length(min=4,message="4글자 이상이어야합니다.")
	private String		userId;
	
	@NotEmpty(message="필수항목입니다.")
	private String		name;
	
	@NotEmpty(message="필수항목입니다.")
	private String		password;
	

	@NotEmpty(message="필수 항목입니다.")
	@Email
	private String		email;
	@NotEmpty(message="필수 항목입니다.")
	private String		phoneNumber;
	private int 		seq;
	private String		salt;
	private UserLevel	userLevel;
	private String		nickName;
	private String		address;
	private Date		regDate;
	private Date		updateDate;
}
