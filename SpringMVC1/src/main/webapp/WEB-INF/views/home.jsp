<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h3><a href="hello.action">Spring Welcome Message </a></h3>

<h2>Spring MVC Controller Test</h2>
<h3>1. <a href="test/param.action?name=suzi&phone=010-123-1234&email=suzi@naver.com" >Get 방식 테스트</a></h3>

<h3>2. Post 방식 테스트</h3>
<form action="test/param.action" method="post">
이름:<input type="text" name="name"/><br/>
번호:<input type="text" name="phone"/><br/>
메일:<input type="text" name="email"/><br/>
<input type="submit" value="전송"/>
</form>

<h3>3. <a href="test/mav.action?name=inna&phone=010-333-3333&email=inna@naver.com" >ModelandView Get 방식 테스트</a></h3>

<h3>4. ModelandView Post 방식 테스트</h3>
<form action="test/mav.action" method="post">
이름:<input type="text" name="name"/><br/>
번호:<input type="text" name="phone"/><br/>
메일:<input type="text" name="email"/><br/>
<input type="submit" value="전송"/>
</form>

<br/>

<h3>5.<a href="test/redirect.action" > REDIRECT TEST</a></h3>


</body>
</html>
