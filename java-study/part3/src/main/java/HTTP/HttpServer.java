package HTTP;

import java.net.ServerSocket;
import java.net.Socket;

import MultiChatting.PerClientThread;

public class HttpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(80);
			System.out.println("서버기동 (80포트)");
			while (true) {
				Socket socket = serverSocket.accept();
				new HttpThread(socket).start();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
