package echo;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {
	public static void main(String[] args) {
		Socket socket=null;
		
		try (ServerSocket server = new ServerSocket(10000)){
			while(true) {
			socket = server.accept();
			new EchoThread(socket).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
