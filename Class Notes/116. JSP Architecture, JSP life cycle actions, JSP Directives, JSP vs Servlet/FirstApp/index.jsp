<%!
	static{
		System.out.println("Servlet loading...");
	}
%>

<%!
	public index_jsp(){
		System.out.println("Servlet Instantiation...");
	}
%>
<%@ page language ="java" session ="false"%>
<h1>The session object is :: <%= session%></h1>

