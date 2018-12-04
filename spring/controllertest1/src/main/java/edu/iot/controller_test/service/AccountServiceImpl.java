package edu.iot.controller_test.service;

import org.springframework.stereotype.Service;

import edu.iot.controller_test.exceoption.LoginFailException;
import edu.iot.controller_test.model.Member;


@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public void login(Member member) throws LoginFailException {
		if(!"ain1234".equals(member.getUserId())) {
			throw new LoginFailException("사용자 아이디가 일치 하지 않습니다.");
		}
		if(!"12341234".equals(member.getPassword())){
			throw new LoginFailException("사용자 패스워드가 일치 하지 않습니다.");
		}
	}
}
