package com.iu.start.bankBook;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BankBookController
 */
@WebServlet("/BankBookController")
public class BankBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankBookController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		BankBookDAO bankBookDAO = new BankBookDAO();	
		if(path.equals("/list")) {
			try {
				ArrayList<BankBookDTO> ar = bankBookDAO.getList();
				for(int i = 0; i <ar.size();i++) {
					System.out.println(ar.get(i).getBookNum());
					System.out.println(ar.get(i).getBookName());
					System.out.println(ar.get(i).getBookRate());
					System.out.println(ar.get(i).getBookSale());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			path = "/WEB-INF/view/bankbook/list.jsp";
		} else if(path.equals("/detail")) {
			path = "../WEB-INF/view/bankbook/detail.jsp";
		}	
			RequestDispatcher view = request.getRequestDispatcher(path);
			view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
