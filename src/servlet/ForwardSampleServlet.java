package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForwardSampleServlet")
public class ForwardSampleServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * デフォルト表示
   */
  protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {

    // フォワード
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/toppage.jsp");
    dispatcher.forward(request, response);
  }
  
  /**
   * 「送信」ボタンが押された時
   */
  protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {

    // リクエストパラメータを取得
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    String gender = request.getParameter("gender");
    String qtype = request.getParameter("qtype");
    String body = request.getParameter("body");

    // リクエストパラメータをチェック
    String errorMsg = "";
    if (name == null || name.length() == 0) {
      errorMsg += "名前が入力されていません<br>";
    }
    if (gender == null || gender.length() == 0) {
      errorMsg += "性別が選択されていません<br>";
    } else {
      if (gender.equals("0")) {
        gender = "男性";
      }
      else if (gender.equals("1")) {
        gender = "女性";
      }
    }
    if (qtype == null || qtype.length() == 0) {
        errorMsg += "お問い合わせの種類が選択されていません<br>";
      }
      if (body == null || body.length() == 0) {
        errorMsg += "お問い合わせの内容が入力されていません<br>";
      }
    
    // 表示するメッセージを設定
    String msg = name + "さん（" + gender + "）を登録しました";
    if (errorMsg.length() != 0) {
      msg = errorMsg;
    }

    // HTMLを出力
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html >");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset=\"UTF-8\">");
    out.println("<title>ユーザー登録結果</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<p>" + msg + "</p>");
    out.println("</body>");
    out.println("</html>");
  }
}