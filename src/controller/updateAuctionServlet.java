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

import dao.AuctionDao;
import dao.PlayerDao;
import model.AuctionModel;

/**
 * Servlet implementation class updateAuctionServlet
 */
@WebServlet("/updateAuctionServlet")
public class updateAuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateAuctionServlet() {
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
		int aid = Integer.parseInt(request.getParameter("Id"));
		int Pid = Integer.parseInt(request.getParameter("pid"));
		int Tid = Integer.parseInt(request.getParameter("tid"));
		int Year = Integer.parseInt(request.getParameter("year"));
		int soldFor = Integer.parseInt(request.getParameter("amt"));
		AuctionModel pm= new AuctionModel(aid,Pid,Tid,Year,soldFor);
		System.out.println("Inside Servlet: "+pm);
		AuctionDao pd = new AuctionDao();
		RequestDispatcher rd =null;
		try {
			pd.updateAuction(aid,Pid,Tid,Year,soldFor);
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
