

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RandomNumbers")
public class RandomNumbers extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random rand=new Random();
		int count=0;
		response.setContentType("text/html; charset=UTF-8");//ここでレスポンスの書式を設定
		PrintWriter out=response.getWriter();
		out.println("<!DOCUTYPE html>");
		out.println("<html>");
		out.println("<title></title>");
		out.println("<meta charset='utf-8'>");
		out.println("<body>");
		while(true) {
			int number=rand.nextInt(801)+100;
			count++;
			out.println("<p>"+count+"回目:"+number+"</p>");
			out.println();
			if(number==777) {
				out.println("<p>"+count+"回目に出ました！</p>");
				break;
			}
		}
		out.println("</body>");
		out.println("</html>");
	}
}

