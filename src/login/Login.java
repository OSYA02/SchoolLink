package login;
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

@WebServlet(urlPatterns={"/login/Login"})
public class Login extends HttpServlet {
    public void doGet(
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            // データベースへの接続
            InitialContext ic = new InitialContext();
            DataSource ds = (DataSource) ic.lookup("java:/comp/env/jdbc/SchoolLink");

            try (Connection conn = ds.getConnection()) {
                // SQL文の作成
                String sql = "SELECT * FROM teacher_information WHERE TI_001_code = ? AND TI_006_pass = ?";
                String sql1 = "SELECT * FROM student_information WHERE SI_001_code = ? AND SI_005_pass = ?";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    // パラメータの設定
                    statement.setString(1, request.getParameter("user"));
                    statement.setString(2, request.getParameter("pass"));

                    // SQL文の実行
                    try (ResultSet rs = statement.executeQuery()) {
                        // ログイン結果の確認
                        if (rs.next()) {
                            // ログイン成功
                            response.sendRedirect("../teacherhome.html");
                        } else {
                        	try (PreparedStatement statement1 = conn.prepareStatement(sql1)) {
                        	    // パラメータの設定
                        	    statement1.setString(1, request.getParameter("user"));
                        	    statement1.setString(2, request.getParameter("pass"));

                        	    // SQL文の実行
                        	    try (ResultSet rs1 = statement1.executeQuery()) {
                        	        // ログイン結果の確認
                        	        if (rs1.next()) {
                        	            // ログイン成功
                        	            response.sendRedirect("../studenthome.html");
                        	        } else {
                        	            // ログイン失敗
                        	            response.sendRedirect("../login.html"); // ログインページにリダイレクト
                        	        }
                        	    }
                        	}
                        }
                    }
                }
            }
        } catch (Exception e) {
            // エラーハンドリング
            out.println("<p>データベースにアクセス中にエラーが発生しました。</p>");
            e.printStackTrace();
        }
    }
}
