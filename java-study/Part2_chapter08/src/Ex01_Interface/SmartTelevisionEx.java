package Ex01_Interface;

public class SmartTelevisionEx {
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		search(stv,"미션임파서블");
		setVolume(stv,17);
		Pad pd = new Pad();
		search(pd,"이상한 나라의 앨리스");
		pd.search("메르스");
	}
	
	public static void search(Searchable tv, String url) {
		tv.search(url);
	}
	
	public static void setVolume(RemoteControl rc, int volume) {
		rc.setVolume(volume);
	}
}
