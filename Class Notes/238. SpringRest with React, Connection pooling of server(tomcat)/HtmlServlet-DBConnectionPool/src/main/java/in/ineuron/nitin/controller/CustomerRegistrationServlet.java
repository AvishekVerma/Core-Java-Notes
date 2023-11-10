package in.ineuron.nitin.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class CustomerRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String INSERT_QUERY = "INSERT INTO CUSTOMER(`cname`,`caddr`,`cemail`) values(?,?,?)";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		response.setContentType("text/html");

		String username = request.getParameter("username");
		String useraddr = request.getParameter("useraddr");
		String useremail = request.getParameter("useremail");

		ServletContext context = getServletContext();
		String jndiName = context.getInitParameter("jndi");
		System.out.println(jndiName);

		try (Connection con = getPooledConnection(jndiName)) {
			System.out.println(con);

			if (con != null) {
				try (PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY)) {
					if (pstmt != null) {
						pstmt.setString(1, username);
						pstmt.setString(2, useraddr);
						pstmt.setString(3, useremail);

						int rowAffected = pstmt.executeUpdate();
						if (rowAffected == 1)
							out.print("<h1 style='color:green; text-align:center;'>ROW INSERTED</h1>");
						else
							out.print("<h1 style='color:red; text-align:center;'>Proble in Row insertion</h1>");

					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private Connection getPooledConnection(String jndiName) throws Exception {

		InitialContext context = new InitialContext();
		DataSource dataSource = (DataSource) context.lookup(jndiName);
		Connection connection = dataSource.getConnection();
		return connection;

	}

}
