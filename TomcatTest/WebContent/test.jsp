<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp 生命周期</title>
</head>
<body>
<%!
	private int initVar = 0;
	private int serviceVar = 0;
	private int destroyVar = 0;
%>

<%!
	public void jspDestroy() {
		System.out.println("JSP 被初始化了: " + (++initVar) + "次");
	}

	public void jspInit() {
		System.out.println("JSP 被销毁了: " + (++destroyVar) + "次");
	}
%>

<%
	serviceVar++;
	System.out.println("JSP 共响应了：" + serviceVar + "次请求");
    String content1="初始化次数 : "+initVar;
 	String content2="响应客户请求次数 : "+serviceVar;
    String content3="销毁次数 : "+destroyVar;
%>

<h1>JSP生命周期</h1>
<p><%=content1 %></p>
<p><%=content2 %></p>
<p><%=content3 %></p>
</body>
</html>