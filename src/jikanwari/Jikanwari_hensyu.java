package jikanwari;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns={"/jikanwari/Jikanwari_hensyu"})
public class Jikanwari_hensyu extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // リクエストから値を取得する
        String value = request.getParameter("class");

        // 値に応じて遷移先を決定する
        String destination = determineDestination(value);

        // 遷移する
        if (destination != null) {
            // リダイレクトの場合
            response.sendRedirect(destination);
        } else {
            // エラーまたはデフォルトの場合
            response.sendRedirect("errorPage.jsp");
        }
    }

    private String determineDestination(String value) {
        // 値に応じて遷移先を決定するロジックを記述する
        if ("class1a".equals(value)) {
            return "Class1_aset";
        } else if ("class1b".equals(value)) {
            return "Class1_bset";
        } else if ("class1c".equals(value)) {
            return "Class1_cset";
        } else if ("class2a".equals(value)) {
            return "Class2_aset";
        } else if ("class2b".equals(value)) {
            return "Class2_bset";
        } else if ("class2c".equals(value)) {
            return "Class2_cset";
        } else if ("class3a".equals(value)) {
            return "Class3_aset";
        } else if ("class3b".equals(value)) {
            return "Class3_bset";
        } else if ("class3c".equals(value)) {
            return "Class3_cset";
        } else {
            return null; // エラーまたはデフォルトの遷移先
        }
    }
}
