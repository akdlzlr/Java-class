package scoretest;

public class Score {
//	�ʵ�
	String studentNo; // �й�
	String name; // �̸�
//	���ڰ� �ƴ� �ڵ��̹Ƿ� String, �ڵ� = ������ �����ϰ��ִ�.
	int koreaScore; // ����
// ������
	public Score() {
	}

	public Score(String studentNo, String name, int koreaScore) {
		super();
		this.studentNo = studentNo;
		this.name = name;
		this.koreaScore = koreaScore;
	}
//	�޼���
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