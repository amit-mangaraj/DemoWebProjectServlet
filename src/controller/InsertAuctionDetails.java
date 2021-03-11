package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AuctionDao;
import model.AuctionModel;

/**
 * Servlet implementation class InsertAuctionDetails
 */
@WebServlet("/InsertAuctionDetails")
public class InsertAuctionDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAuctionDetails() {
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
		// TODO Auto-generated method stub
		int autId= Integer.parseInt(request.getParameter("Id"));
		int pId= Integer.parseInt(request.getParameter("pid"));
		int tId= Integer.parseInt(request.getParameter("tid"));
		int year= Integer.parseInt(request.getParameter("year"));
		int amount= Integer.parseInt(request.getParameter("amt"));
		AuctionModel am= new AuctionModel(autId,pId,tId,year,amount);
		System.out.println("Inside Servlet: "+am);
		AuctionDao ad = new AuctionDao();
		try {
			ad.insertAuctionDetails(am);
			System.out.println("added Succesfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
