package edu.iot.chapter4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Member {
	String name;
	String userId;
	String userPwd;
	String loginCheck;
}
