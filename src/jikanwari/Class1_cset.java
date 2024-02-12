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

@WebServlet(urlPatterns={"/jikanwari/Class1_cset"})
public class Class1_cset extends HttpServlet {
    public void doGet (
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out=response.getWriter();

        try {
            InitialContext ic=new InitialContext();
            DataSource ds=(DataSource)ic.lookup("java:/comp/env/jdbc/SchoolLink");
            Connection con=ds.getConnection();

            PreparedStatement st1=con.prepareStatement("SELECT 月 FROM class1_c LIMIT 1 OFFSET 0");
            ResultSet rs1=st1.executeQuery();
            PreparedStatement st2=con.prepareStatement("SELECT 火 FROM class1_c LIMIT 1 OFFSET 0");
            ResultSet rs2=st2.executeQuery();
            PreparedStatement st3=con.prepareStatement("SELECT 水 FROM class1_c LIMIT 1 OFFSET 0");
            ResultSet rs3=st3.executeQuery();
            PreparedStatement st4=con.prepareStatement("SELECT 木 FROM class1_c LIMIT 1 OFFSET 0");
            ResultSet rs4=st4.executeQuery();
            PreparedStatement st5=con.prepareStatement("SELECT 金 FROM class1_c LIMIT 1 OFFSET 0");
            ResultSet rs5=st5.executeQuery();

            PreparedStatement st11=con.prepareStatement("SELECT 月 FROM class1_c LIMIT 1 OFFSET 1");
            ResultSet rs11=st11.executeQuery();
            PreparedStatement st21=con.prepareStatement("SELECT 火 FROM class1_c LIMIT 1 OFFSET 1");
            ResultSet rs21=st21.executeQuery();
            PreparedStatement st31=con.prepareStatement("SELECT 水 FROM class1_c LIMIT 1 OFFSET 1");
            ResultSet rs31=st31.executeQuery();
            PreparedStatement st41=con.prepareStatement("SELECT 木 FROM class1_c LIMIT 1 OFFSET 1");
            ResultSet rs41=st41.executeQuery();
            PreparedStatement st51=con.prepareStatement("SELECT 金 FROM class1_c LIMIT 1 OFFSET 1");
            ResultSet rs51=st51.executeQuery();

            PreparedStatement st12=con.prepareStatement("SELECT 月 FROM class1_c LIMIT 1 OFFSET 2");
            ResultSet rs12=st12.executeQuery();
            PreparedStatement st22=con.prepareStatement("SELECT 火 FROM class1_c LIMIT 1 OFFSET 2");
            ResultSet rs22=st22.executeQuery();
            PreparedStatement st32=con.prepareStatement("SELECT 水 FROM class1_c LIMIT 1 OFFSET 2");
            ResultSet rs32=st32.executeQuery();
            PreparedStatement st42=con.prepareStatement("SELECT 木 FROM class1_c LIMIT 1 OFFSET 2");
            ResultSet rs42=st42.executeQuery();
            PreparedStatement st52=con.prepareStatement("SELECT 金 FROM class1_c LIMIT 1 OFFSET 2");
            ResultSet rs52=st52.executeQuery();

            PreparedStatement st13=con.prepareStatement("SELECT 月 FROM class1_c LIMIT 1 OFFSET 3");
            ResultSet rs13=st13.executeQuery();
            PreparedStatement st23=con.prepareStatement("SELECT 火 FROM class1_c LIMIT 1 OFFSET 3");
            ResultSet rs23=st23.executeQuery();
            PreparedStatement st33=con.prepareStatement("SELECT 水 FROM class1_c LIMIT 1 OFFSET 3");
            ResultSet rs33=st33.executeQuery();
            PreparedStatement st43=con.prepareStatement("SELECT 木 FROM class1_c LIMIT 1 OFFSET 3");
            ResultSet rs43=st43.executeQuery();
            PreparedStatement st53=con.prepareStatement("SELECT 金 FROM class1_c LIMIT 1 OFFSET 3");
            ResultSet rs53=st53.executeQuery();

            PreparedStatement st14=con.prepareStatement("SELECT 月 FROM class1_c LIMIT 1 OFFSET 4");
            ResultSet rs14=st14.executeQuery();
            PreparedStatement st24=con.prepareStatement("SELECT 火 FROM class1_c LIMIT 1 OFFSET 4");
            ResultSet rs24=st24.executeQuery();
            PreparedStatement st34=con.prepareStatement("SELECT 水 FROM class1_c LIMIT 1 OFFSET 4");
            ResultSet rs34=st34.executeQuery();
            PreparedStatement st44=con.prepareStatement("SELECT 木 FROM class1_c LIMIT 1 OFFSET 4");
            ResultSet rs44=st44.executeQuery();
            PreparedStatement st54=con.prepareStatement("SELECT 金 FROM class1_c LIMIT 1 OFFSET 4");
            ResultSet rs54=st54.executeQuery();

            PreparedStatement st15=con.prepareStatement("SELECT 月 FROM class1_c LIMIT 1 OFFSET 5");
            ResultSet rs15=st15.executeQuery();
            PreparedStatement st25=con.prepareStatement("SELECT 火 FROM class1_c LIMIT 1 OFFSET 5");
            ResultSet rs25=st25.executeQuery();
            PreparedStatement st35=con.prepareStatement("SELECT 水 FROM class1_c LIMIT 1 OFFSET 5");
            ResultSet rs35=st35.executeQuery();
            PreparedStatement st45=con.prepareStatement("SELECT 木 FROM class1_c LIMIT 1 OFFSET 5");
            ResultSet rs45=st45.executeQuery();
            PreparedStatement st55=con.prepareStatement("SELECT 金 FROM class1_c LIMIT 1 OFFSET 5");
            ResultSet rs55=st55.executeQuery();
            // HTML テーブルの開始タグを出力
            out.println("<style>" +
                    "head, h1{background-color: #333;}" +
                    "h1{padding: 30px 3px;margin-top: -5px;text-align: center;font-size: 36px;color: #fff;}" +
                    "table { border-collapse: collapse; width: 100%; }" +
                    "table {background-color: #ffffff;}" +
                    "th, td { border: 1px solid black; padding: 15px; text-align: center; }" +
                    "th { background-color: #f2f2f2; }" +
                    "body {background-color: #e0f7fa;}" +
                    "body {margin: 0;}" +
                    "body {padding: 0;}" +
                    "a {color: #ffffff; text-decoration: none; }" +
                    "</style>");
            out.println("<html>");
            out.println("<title>大原中学校</title>");
            out.println("<h1><a href=\"../teacherhome.html\">大原中学校</a></h1>");
            out.println("<body>");

            out.println("<form action=\"Class1_cup\" method=\"get\">");

            out.println("<table border='1'>");

            // テーブルのヘッダー行を出力
            out.println("<tr>");
            out.println("<th></th>");
            out.println("<th>月</th>");
            out.println("<th>火</th>");
            out.println("<th>水</th>");
            out.println("<th>木</th>");
            out.println("<th>金</th>");
            out.println("</tr>");

            // テーブルのデータ行を出力
            while (rs1.next()) {
                out.println("<tr>");
                out.println("<td>1時間目</td>");
                out.println("<td><select name='monday1'><option value='" + rs1.getString("月") + "'>" + rs1.getString("月") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
            }
            while (rs2.next()) {
                out.println("<td><select name='tuesday1'><option value='" + rs2.getString("火") + "'>" + rs2.getString("火") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
            }
            while (rs3.next()) {
                out.println("<td><select name='wednesday1'><option value='" + rs3.getString("水") + "'>" + rs3.getString("水") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
            }
            while (rs4.next()) {
                out.println("<td><select name='thursday1'><option value='" + rs4.getString("木") + "'>" + rs4.getString("木") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
            }
            while (rs5.next()) {
                out.println("<td><select name='friday1'><option value='" + rs5.getString("金") + "'>" + rs5.getString("金") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
                out.println("</tr>");
            }

            while (rs11.next()) {
                out.println("<tr>");
                out.println("<td>2時間目</td>");
                out.println("<td><select name='monday2'><option value='" + rs11.getString("月") + "'>" + rs11.getString("月") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
            }
            while (rs21.next()) {
                out.println("<td><select name='tuesday2'><option value='" + rs21.getString("火") + "'>" + rs21.getString("火") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
            }
            while (rs31.next()) {
                out.println("<td><select name='wednesday2'><option value='" + rs31.getString("水") + "'>" + rs31.getString("水") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
            }
            while (rs41.next()) {
                out.println("<td><select name='thursday2'><option value='" + rs41.getString("木") + "'>" + rs41.getString("木") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
            }
            while (rs51.next()) {
                out.println("<td><select name='friday2'><option value='" + rs51.getString("金") + "'>" + rs51.getString("金") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
                out.println("</tr>");
            }

            while (rs12.next()) {
                out.println("<tr>");
                out.println("<td>3時間目</td>");
                out.println("<td><select name='monday3'><option value='" + rs12.getString("月") + "'>" + rs12.getString("月") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
            }
            while (rs22.next()) {
                out.println("<td><select name='tuesday3'><option value='" + rs22.getString("火") + "'>" + rs22.getString("火") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
            }
            while (rs32.next()) {
                out.println("<td><select name='wednesday3'><option value='" + rs32.getString("水") + "'>" + rs32.getString("水") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
            }
            while (rs42.next()) {
                out.println("<td><select name='thursday3'><option value='" + rs42.getString("木") + "'>" + rs42.getString("木") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
            }
            while (rs52.next()) {
                out.println("<td><select name='friday3'><option value='" + rs52.getString("金") + "'>" + rs52.getString("金") + "</option>"
                		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
                out.println("</tr>");
            }

	        while (rs13.next()) {
	            out.println("<tr>");
	            out.println("<td>4時間目</td>");
	            out.println("<td><select name='monday4'><option value='" + rs13.getString("月") + "'>" + rs13.getString("月") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	        }
	        while (rs23.next()) {
	            out.println("<td><select name='tuesday4'><option value='" + rs23.getString("火") + "'>" + rs23.getString("火") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	        }
	        while (rs33.next()) {
	            out.println("<td><select name='wednesday4'><option value='" + rs33.getString("水") + "'>" + rs33.getString("水") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	        }
	        while (rs43.next()) {
	            out.println("<td><select name='thursday4'><option value='" + rs43.getString("木") + "'>" + rs43.getString("木") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	        }
	        while (rs53.next()) {
	            out.println("<td><select name='friday4'><option value='" + rs53.getString("金") + "'>" + rs53.getString("金") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	            out.println("</tr>");
	        }

	        while (rs14.next()) {
	            out.println("<tr>");
	            out.println("<td>5時間目</td>");
	            out.println("<td><select name='monday5'><option value='" + rs14.getString("月") + "'>" + rs14.getString("月") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	        }
	        while (rs24.next()) {
	            out.println("<td><select name='tuesday5'><option value='" + rs24.getString("火") + "'>" + rs24.getString("火") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	        }
	        while (rs34.next()) {
	            out.println("<td><select name='wednesday5'><option value='" + rs34.getString("水") + "'>" + rs34.getString("水") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	        }
	        while (rs44.next()) {
	            out.println("<td><select name='thursday5'><option value='" + rs44.getString("木") + "'>" + rs44.getString("木") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	        }
	        while (rs54.next()) {
	            out.println("<td><select name='friday5'><option value='" + rs54.getString("金") + "'>" + rs54.getString("金") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	            out.println("</tr>");
	        }

	        while (rs15.next()) {
	            out.println("<tr>");
	            out.println("<td>6時間目</td>");
	            out.println("<td><select name='monday6'><option value='" + rs15.getString("月") + "'>" + rs15.getString("月") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	        }
	        while (rs25.next()) {
	            out.println("<td><select name='tuesday6'><option value='" + rs25.getString("火") + "'>" + rs25.getString("火") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	        }
	        while (rs35.next()) {
	            out.println("<td><select name='wednesday6'><option value='" + rs35.getString("水") + "'>" + rs35.getString("水") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	        }
	        while (rs45.next()) {
	            out.println("<td><select name='thursday6'><option value='" + rs45.getString("木") + "'>" + rs45.getString("木") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	        }
	        while (rs55.next()) {
	            out.println("<td><select name='friday6'><option value='" + rs55.getString("金") + "'>" + rs55.getString("金") + "</option>"
	            		+ "<option>国語</option><option>数学</option><option>理科</option><option>社会</option><option>英語</option><option>道徳</option><option>書写</option><option>音楽</option><option>武道</option><option>体育</option><option>技術</option><option>美術</option><option>学び</option><option>家庭</option><option>総合</option></select></td>");
	            out.println("</tr>");
	        }

            // HTML テーブルの終了タグを出力
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");

            st1.close();
            st2.close();
            st3.close();
            st4.close();
            st5.close();

            st11.close();
            st21.close();
            st31.close();
            st41.close();
            st51.close();

            st12.close();
            st22.close();
            st32.close();
            st42.close();
            st52.close();

            st13.close();
            st23.close();
            st33.close();
            st43.close();
            st53.close();

            st14.close();
            st24.close();
            st34.close();
            st44.close();
            st54.close();

            st15.close();
            st25.close();
            st35.close();
            st45.close();
            st55.close();
            con.close();

            out.println("<input class=\"submit\" type=\"submit\" value=\"確定\">");



        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }
}
