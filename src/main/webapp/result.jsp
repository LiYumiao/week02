<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page import="javafx.beans.binding.ListExpression" %>
<%--
  Created by IntelliJ IDEA.
  User: LiYumiao
  Date: 2021/5/13
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>
<%
    List styles = (List)request.getAttribute("styles");
    Iterator it = styles.iterator();
    while (it.hasNext()){
        out.print ("<br>try: " + it.next());
    }

%>
</body>
</html>
