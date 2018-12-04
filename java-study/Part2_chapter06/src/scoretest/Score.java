package scoretest;

public class Score {
//	필드
	String studentNo; // 학번
	String name; // 이름
//	숫자가 아닌 코드이므로 String, 코드 = 정보를 포함하고있다.
	int koreaScore; // 점수
// 생성자
	public Score() {
	}

	public Score(String studentNo, String name, int koreaScore) {
		super();
		this.studentNo = studentNo;
		this.name = name;
		this.koreaScore = koreaScore;
	}
//	메서드
	public int getKoreaScore() {
		return koreaScore;
	}

	public void setKoreaScore(int koreaScore) {
		this.koreaScore = koreaScore;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Score [studentNo=" + studentNo + ", name=" + name + ", koreaScore=" + koreaScore + "]";
	}
}