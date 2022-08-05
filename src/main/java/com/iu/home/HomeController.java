package com.iu.home;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iu.start.bankBook.BankBookDAO;
import com.iu.start.bankBook.BankBookDTO;

/**
 * Servlet implementation class homeController
 */
@WebServlet("/homeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello!!!!!!!😁😁😁😁");
		BankBookDAO dao = new BankBookDAO();
		ArrayList<BankBookDTO> ar = null;
		try {
			ar = dao.getList();
			
			request.setAttribute("list", ar);
			
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/index.jsp");
			view.forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<h1>Hi<h2>");
//		for(BankBookDTO bankBookDTO : ar) {
//			out.println("<h3>");
//			out.println(bankBookDTO.getBookNum());
//			out.println("</h3>");
//			out.println("<h3>");
//			out.println(bankBookDTO.getBookName());
//			out.println("</h3>");
//			out.println("<h3>");
//			out.println(bankBookDTO.getBookRate());
//			out.println("</h3>");
//			out.println("<h3>");
//			out.println(bankBookDTO.getBookSale());
//			out.println("</h3>");
//		}
//		out.println("</body>");
//		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
