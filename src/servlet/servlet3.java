package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet3 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException {
		RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/login.jsp");
		dispatcher.forward(request, response);
	}
}
