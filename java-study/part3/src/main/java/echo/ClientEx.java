package echo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost",10000)){
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			String str = "Hello, Server";
			out.write(str.getBytes());
			out.flush();
			
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
