package Ex01_Interface;

public class Pad implements Searchable {

	@Override
	public void search(String url) {
		System.out.println(url+"를 검색합니다.");
	}

}
