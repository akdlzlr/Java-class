package echo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		Socket socket = null;
//		서버 소켓 생성
		try (ServerSocket serverSocket = new ServerSocket(10000); ){
			socket = serverSocket.accept();
			
//			수신 스트림
			InputStream in = socket.getInputStream();
//			전송 스트림
			OutputStream out = socket.getOutputStream();
			
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			
			String str = "Hello, Client";
			out.write(str.getBytes());
			out.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally{
			try {
				socket.close();
			} catch (Exception e) { }
		}
	}
}
