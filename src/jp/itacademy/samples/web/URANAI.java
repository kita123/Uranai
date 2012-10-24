package jp.itacademy.samples.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BloodType
 */
@WebServlet("/BloodType")
public class URANAI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public URANAI() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/bmi; charset=utf-8");
		PrintWriter out=res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<form action=\"/Uranai/BloodType\">");
		out.println("<p>ŒŒ‰tŒ^‚ð‘I‘ð‚µ‚Ä‚­‚¾‚³‚¢</p>");
		out.println("<select name=\"BloodType\">");
				out.println("<option value=\"\">--‘I‘ð‚µ‚Ä‚­‚¾‚³‚¢--</option>");
				out.println("<option value=\"A\">AŒ^</option>");
				out.println("<option value=\"B\">BŒ^</option>");
				out.println("<option value=\"O\">OŒ^</option>");
				out.println("<option value=\"AB\">ABŒ^</option>");
				out.println("</select>");
		out.println("<p><input type=\"submit\" value=\"è‚¤\"></p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
