<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フォワードのサンプル</title>
</head>
<body>
<h1>フォワードのサンプル</h1>
<p>フォワードされたページです</p>
	<form action="/example2/ForwardSampleServlet" method="post">
		<h2>お問い合わせフォーム</h2>
		名前：<br>
		<input type="text" name="name"><br>
		性別：<br>
		男<input type="radio" name="gender" value="0">
		女<input type="radio" name="gender" value="1">
		<br>
		<label for="qtype">お問い合わせの種類：</label><br>
		<select name=”qtype”  id="qtype">
			<option value=””  selected></option>
			<option value=”company”>会社について</option>
			<option value=”product”>製品について</option>
			<option value=”support”>アフターサポートについて</option>
		</select><br>
		<label for="body">お問い合わせの内容：</label>
		<textarea name="body" id="body" cols=500 rows=6></textarea>
		以上の内容で<input type="submit" value="送信">
		</form>
</body>
</html>