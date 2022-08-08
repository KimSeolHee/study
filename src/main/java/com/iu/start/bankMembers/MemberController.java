package com.iu.start.bankMembers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iu.start.member.BankMembersDAO;
import com.iu.start.member.BankMembersDTO;

/**
 * Servlet implementation class BankMembers
 */
@WebServlet("/BankMembers")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    ※ 한글깨질때 쓰는 메서드
//		request.setCharacterEncoding("UTF-8");
//		response.setCharacterEncoding("UTF-8");
		System.out.println("멤버관리");
		
		BankMembersDAO dao = new BankMembersDAO();
		String path = request.getPathInfo();
		
		if(path.equals("/login")) {
			
			if(request.getMethod().equals("POST")) {
				System.out.println("로그인 처리");
			}else {
				path = "/WEB-INF/view/member/login.jsp";				
			}
			
			//redirect
//			response.sendRedirect("../");
//			return;
		}else if(path.equals("/join")) {
			path = "/WEB-INF/view/member/join.jsp";
			String method = request.getMethod();
			if(method.equals("POST")) {
				BankMembersDTO dto = new BankMembersDTO();
				dto.setId(request.getParameter("id"));
				dto.setPw(request.getParameter("pw"));
				dto.setName(request.getParameter("name"));
				dto.setEmail(request.getParameter("email"));
				dto.setPhone(request.getParameter("phone"));
				
				try {
					int result = dao.setJoin(dto);
					if(result == 1) {
						System.out.println("성공");
					}else {
						System.out.println("실패");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			};
			
		} else if(path.equals("/search")) {
			String method = request.getMethod();
			if(method.equals("GET")) {
				path = "/WEB-INF/view/member/search.jsp";				
			}else {
				String search = request.getParameter("search");
				System.out.println(search);
				try {
					ArrayList<BankMembersDTO> ar = dao.getSearchById(search);
					request.setAttribute("list", ar);
					path="/WEB-INF/view/member/list.jsp";
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		RequestDispatcher view = request.getRequestDispatcher(path);
		view.forward(request, response);
		
		
//		String result = request.getMethod();
//		result = request.getRequestURI().toString();
//		result = request.getRequestURL().toString();
//		result = request.getContextPath();
//		result = request.getPathInfo();
//		System.out.println(result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
