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
		out.println("<p>���t�^��I�����Ă�������</p>");
		out.println("<select name=\"BloodType\">");
				out.println("<option value=\"\">--�I�����Ă�������--</option>");
				out.println("<option value=\"A\">A�^</option>");
				out.println("<option value=\"B\">B�^</option>");
				out.println("<option value=\"O\">O�^</option>");
				out.println("<option value=\"AB\">AB�^</option>");
				out.println("</select>");
		out.println("<p><input type=\"submit\" value=\"�肤\"></p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
