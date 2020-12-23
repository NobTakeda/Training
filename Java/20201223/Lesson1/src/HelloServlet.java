import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")//ここでURLを決めている。デフォルトではクラス名と同じ
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String[] luckArray = {"超スッキリ","スッキリ","最悪"};
		int index=(int) (Math.random()*3);//Math.random() 自体は0.000...〜0.9999...の乱数なので、3をかけて(0~2)
		String luck=luckArray[index];

		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM月dd日");
		String today=sdf.format(date);

		response.setContentType("text/html; charset=UTF-8");//ここでレスポンスの書式を設定
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>スッキリ占い</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+today+"の運勢は「"+luck+ "」です</p>");
		out.println("</body>");
		out.println("</html>");
	}
}