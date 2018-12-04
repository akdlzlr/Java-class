package Ex07_StringClass;

public class StringSubstringEx {
	public static void main(String[] args) {
		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6); // 0���� 6�� �ձ���
		System.out.println(firstNum); // 6�� ���� �����ʴ´�.

		String secondNum = ssn.substring(7); // 7���� ������
		System.out.println(secondNum);

		int loc = ssn.indexOf("-");

		if (loc != -1) {
			firstNum = ssn.substring(0, loc);
			System.out.println(firstNum);
			secondNum = ssn.substring(loc + 1);
			System.out.println(secondNum);
		}

		String fileName = "Mission.Impossible.Six.Fallout.mp4";

		loc = fileName.lastIndexOf(".");
		if (loc != -1) {
			String firstStr = fileName.substring(0, loc);
			System.out.println("���� �� = " + firstStr);
			String secondStr = fileName.substring(loc + 1);
			System.out.println("Ȯ���� �� = " + secondStr);
		}
	}
}