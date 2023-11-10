package in.ineuron.nitin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			
			//Looking for JNDI registry with the name called "jndi"
			DataSource ds = (DataSource)envCtx.lookup("jndi");

			Connection conn = ds.getConnection();
			PrintWriter out = response.getWriter();
			out.println("<h1>Connection poool of server is :: "+conn+"</h1>");
			out.close();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}
	}

}
