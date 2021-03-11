package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TeamDao;
import model.TeamModel;

/**
 * Servlet implementation class editTeamServlet
 */
@WebServlet("/editTeamServlet")
public class editTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editTeamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int pid = Integer.parseInt(request.getParameter("Id"));
		String pname = request.getParameter("name");
		String oname = request.getParameter("Oname");
		String cname = request.getParameter("cname");
		TeamModel tm= new TeamModel(pid,pname,oname,cname);
		System.out.println("Inside Servlet: "+tm);
		TeamDao td= new TeamDao();
		//RequestDispatcher rd =null;
		try {
			td.updateTeam(pid,pname,oname,cname);
//			rd=request.getRequestDispatcher("Success.html");
//			rd.forward(request, response);
			System.out.println("added Succesfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			rd=request.getRequestDispatcher("addTeam.html");
//			rd.include(request, response);
			e.printStackTrace();
		}
		doGet(request, response);

	}

}
