package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PlayerDao;
import model.PlayerModel;

/**
 * Servlet implementation class UpdatePlayerServlet
 */
@WebServlet("/UpdatePlayerServlet")
public class UpdatePlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePlayerServlet() {
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
		 PrintWriter out = response.getWriter();  
			int pid = Integer.parseInt(request.getParameter("Id"));
			String pname = request.getParameter("name");
			String skill = request.getParameter("skill");
			Date dob = Date.valueOf(request.getParameter("dob"));
			int runs = Integer.parseInt(request.getParameter("runs"));
			int wic = Integer.parseInt(request.getParameter("wickets"));
			int matches = Integer.parseInt(request.getParameter("matches"));
			String Pcountry = request.getParameter("iscountry");
			int tid = Integer.parseInt(request.getParameter("Teamid"));
			PlayerModel pm= new PlayerModel(pid,pname,skill,dob,runs,wic,matches,Pcountry,tid);
			System.out.println("Inside Servlet: "+pm);
			PlayerDao pd = new PlayerDao();
			RequestDispatcher rd =null;
			try {
				pd.updatePlayer(pid,pname,skill,dob,runs,wic,matches,Pcountry,tid);
				rd=request.getRequestDispatcher("Success.html");
				rd.forward(request, response);
				//System.out.println("added Succesfully");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				out.write("Already Player id Used: "+e);
				rd=request.getRequestDispatcher("addplayer.html");
				rd.include(request, response);
				e.printStackTrace();
			}
			doGet(request, response);
		}

}
