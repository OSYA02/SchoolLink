package jikanwari;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet(urlPatterns={"/jikanwari/Class3_c"})
public class Class3_c extends HttpServlet {
	public void doGet (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();

		try {
			InitialContext ic=new InitialContext();
			DataSource ds=(DataSource)ic.lookup("java:/comp/env/jdbc/SchoolLink");
			Connection con=ds.getConnection();
			PreparedStatement st=con.prepareStatement("select * from CLASS3_C");
			ResultSet rs=st.executeQuery();

            out.println("<style>" +
                    "table { border-collapse: collapse; width: 100%; }" +
                    "th, td { border: 1px solid black; padding: 15px; text-align: center; }" +
                    "th { background-color: #f2f2f2; }" +
                    "</style>");

            out.println("<table border='1'><tr><th>  </th><th>月</th><th>火</th><th>水</th><th>木</th><th>金</th></tr>");

            int a = 1;
			while (rs.next()){
				out.println("<tr><td>");
				out.print(a);
				out.println("時間目");
				out.println("</td><td>");
				out.println(rs.getString("月"));
				out.println("</td><td>");
				out.println(rs.getString("火"));
				out.println("</td><td>");
				out.println(rs.getString("水"));
				out.println("</td><td>");
				out.println(rs.getString("木"));
				out.println("</td><td>");
				out.println(rs.getString("金"));
				out.println("</td></tr>");
				a += 1;
			}

            out.println("</table>");

            st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}
