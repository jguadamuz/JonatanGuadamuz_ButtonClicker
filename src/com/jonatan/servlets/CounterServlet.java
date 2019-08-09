package com.jonatan.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Counter
 */
@WebServlet("/Counter")
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Integer counter;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		counter = (Integer) session.getAttribute("counter");

		if(counter == null) {
			counter = 0;
		} else {
			counter++;
		}

		request.setAttribute("counter", counter);
		session.setAttribute("counter", counter);
		RequestDispatcher view = request.getRequestDispatcher("/html/Home.jsp");
		view.forward(request, response);

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
