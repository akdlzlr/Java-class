package Ex01_Interface;

public class SmartTelevisionEx {
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		search(stv,"�̼����ļ���");
		setVolume(stv,17);
		Pad pd = new Pad();
		search(pd,"�̻��� ������ �ٸ���");
		pd.search("�޸���");
	}
	
	public static void search(Searchable tv, String url) {
		tv.search(url);
	}
	
	public static void setVolume(RemoteControl rc, int volume) {
		rc.setVolume(volume);
	}
}
