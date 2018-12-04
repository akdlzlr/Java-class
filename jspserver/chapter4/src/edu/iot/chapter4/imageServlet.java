package edu.iot.chapter4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class imageServlet
 */
@WebServlet("/image")
public class imageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("id"));
		String fileName = request.getParameter("id")+".jpg";
		// 중요, 객체에서 경로 얻기, 생명주기는 request와 같다.
		String path= request.getServletContext()
				.getRealPath("/images/"+fileName);
		
		
		System.out.println(path+"이미지를 요청했습니다.");
		File file = new File(path);
		if(!new File(path).exists()) {
			response.sendError(404,fileName+"File not found");
			return;
		}
		
		response.setContentType("image/jpeg");
		response.addHeader("Conent-Length", ""+file.length());
		
		// 브라우저와 연결된 OutputStream 얻기
		// 참고 : 문자 출력시에는 response.getWriter()
		//		바이트(바이너리) 출력시 response.getOutputStream()
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());){
			int data;
			while((data=in.read())!=-1) {
				out.write(data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
