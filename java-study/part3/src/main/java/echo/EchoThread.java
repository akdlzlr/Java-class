package echo;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoThread extends WorkThread {

	public EchoThread(Socket socket) {
		super(socket);
	}

	@Override
	void process(BufferedReader r, PrintWriter w) throws Exception{
//		메세지 수신
		String line = r.readLine();
		System.out.println("서버 수신 메시지 : "+line);
		
//		메시지 전송
		w.println(line);
		w.flush();

	}

}
