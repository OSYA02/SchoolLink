package jikanwari;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet(urlPatterns={"/jikanwari/Class1_bup"})
public class Class1_bup extends HttpServlet {
    public void doGet(
    	HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            // データベースへの接続
            InitialContext ic=new InitialContext();
            DataSource ds=(DataSource)ic.lookup("java:/comp/env/jdbc/SchoolLink");


            try (Connection conn = ds.getConnection()) {
                // トランザクションの開始
                conn.setAutoCommit(false);

                // SQL文の作成
                String sql1 = "UPDATE Class1_b SET 月 = ?, 火 = ?, 水 = ?, 木 = ?, 金 = ? WHERE 時間 = ?";
                String sql2 = "UPDATE Class1_b SET 月 = ?, 火 = ?, 水 = ?, 木 = ?, 金 = ? WHERE 時間 = ?";
                String sql3 = "UPDATE Class1_b SET 月 = ?, 火 = ?, 水 = ?, 木 = ?, 金 = ? WHERE 時間 = ?";
                String sql4 = "UPDATE Class1_b SET 月 = ?, 火 = ?, 水 = ?, 木 = ?, 金 = ? WHERE 時間 = ?";
                String sql5 = "UPDATE Class1_b SET 月 = ?, 火 = ?, 水 = ?, 木 = ?, 金 = ? WHERE 時間 = ?";
                String sql6 = "UPDATE Class1_b SET 月 = ?, 火 = ?, 水 = ?, 木 = ?, 金 = ? WHERE 時間 = ?";

                try (PreparedStatement statement = conn.prepareStatement(sql1)) {
                    // パラメータの設定
                    statement.setString(1, request.getParameter("monday1"));
                    statement.setString(2, request.getParameter("tuesday1"));
                    statement.setString(3, request.getParameter("wednesday1"));
                    statement.setString(4, request.getParameter("thursday1"));
                    statement.setString(5, request.getParameter("friday1"));
                    statement.setInt(6, 1); // idに該当する行を指定

                    // SQL文の実行
                    int rowsAffected = statement.executeUpdate();

                    // トランザクションのコミット
                    conn.commit();

                    // 更新結果の確認
                    if (rowsAffected > 0) {
                        out.println("<p>１時間目のデータが正常に更新されました。</p>");
                    } else {
                        out.println("<p>データの更新に失敗しました。</p>");
                    }
                }

                try (PreparedStatement statement = conn.prepareStatement(sql2)) {
                    // パラメータの設定
                    statement.setString(1, request.getParameter("monday2"));
                    statement.setString(2, request.getParameter("tuesday2"));
                    statement.setString(3, request.getParameter("wednesday2"));
                    statement.setString(4, request.getParameter("thursday2"));
                    statement.setString(5, request.getParameter("friday2"));
                    statement.setInt(6, 2); // idに該当する行を指定（時間が2の場合）

                    // SQL文の実行
                    int rowsAffected = statement.executeUpdate();

                    // トランザクションのコミット
                    conn.commit();

                    // 更新結果の確認
                    if (rowsAffected > 0) {
                        out.println("<p>２時間目のデータが正常に更新されました。</p>");
                    } else {
                        out.println("<p>データの更新に失敗しました。</p>");
                    }
                }

                try (PreparedStatement statement = conn.prepareStatement(sql3)) {
                    // パラメータの設定
                    statement.setString(1, request.getParameter("monday3"));
                    statement.setString(2, request.getParameter("tuesday3"));
                    statement.setString(3, request.getParameter("wednesday3"));
                    statement.setString(4, request.getParameter("thursday3"));
                    statement.setString(5, request.getParameter("friday3"));
                    statement.setInt(6, 3); // 時間が3の場合

                    // SQL文の実行
                    int rowsAffected = statement.executeUpdate();

                    // トランザクションのコミット
                    conn.commit();

                    // 更新結果の確認
                    if (rowsAffected > 0) {
                        out.println("<p>３時間目のデータが正常に更新されました。</p>");
                    } else {
                        out.println("<p>データの更新に失敗しました。</p>");
                    }
                }

                try (PreparedStatement statement = conn.prepareStatement(sql4)) {
                    // パラメータの設定
                    statement.setString(1, request.getParameter("monday4"));
                    statement.setString(2, request.getParameter("tuesday4"));
                    statement.setString(3, request.getParameter("wednesday4"));
                    statement.setString(4, request.getParameter("thursday4"));
                    statement.setString(5, request.getParameter("friday4"));
                    statement.setInt(6, 4); // 時間が4の場合

                    // SQL文の実行
                    int rowsAffected = statement.executeUpdate();

                    // トランザクションのコミット
                    conn.commit();

                    // 更新結果の確認
                    if (rowsAffected > 0) {
                        out.println("<p>４時間目のデータが正常に更新されました。</p>");
                    } else {
                        out.println("<p>データの更新に失敗しました。</p>");
                    }
                }

                try (PreparedStatement statement = conn.prepareStatement(sql5)) {
                    // パラメータの設定
                    statement.setString(1, request.getParameter("monday5"));
                    statement.setString(2, request.getParameter("tuesday5"));
                    statement.setString(3, request.getParameter("wednesday5"));
                    statement.setString(4, request.getParameter("thursday5"));
                    statement.setString(5, request.getParameter("friday5"));
                    statement.setInt(6, 5); // 時間が5の場合

                    // SQL文の実行
                    int rowsAffected = statement.executeUpdate();

                    // トランザクションのコミット
                    conn.commit();

                    // 更新結果の確認
                    if (rowsAffected > 0) {
                        out.println("<p>５時間目のデータが正常に更新されました。</p>");
                    } else {
                        out.println("<p>データの更新に失敗しました。</p>");
                    }
                }

                try (PreparedStatement statement = conn.prepareStatement(sql6)) {
                    // パラメータの設定
                    statement.setString(1, request.getParameter("monday6"));
                    statement.setString(2, request.getParameter("tuesday6"));
                    statement.setString(3, request.getParameter("wednesday6"));
                    statement.setString(4, request.getParameter("thursday6"));
                    statement.setString(5, request.getParameter("friday6"));
                    statement.setInt(6, 6); // 時間が6の場合

                    // SQL文の実行
                    int rowsAffected = statement.executeUpdate();

                    // トランザクションのコミット
                    conn.commit();

                    if (rowsAffected > 0) {
                        out.println("<script>window.location.href='jikanwari_kanryou1.html';</script>");
                    } else {
                        out.println("<p>データの更新に失敗しました。</p>");
                        // 失敗した場合の処理を追加する場合
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
