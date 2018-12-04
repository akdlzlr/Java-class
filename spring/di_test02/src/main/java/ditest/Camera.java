package ditest;

import org.springframework.beans.factory.annotation.Required;

import lombok.Data;

@Data
public class Camera {
	private int number;
	
	@Required	//	필수 프로퍼티 명시
	public void setNumber(int number) {
		this.number = number;
	}
}
