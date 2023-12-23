package com.healthcare.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.healthcare.entity.Patient;
import com.healthcare.entity.Vitals;
import com.healthcare.service.PatientService;
import com.healthcare.service.VitalsService;

/**
 * Servlet implementation class VitalsController
 */
@WebServlet("/VitalsController")
public class VitalsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VitalsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VitalsService vs=new VitalsService();
		String operation=request.getParameter("operation");
		if(operation.equals("view_Vitals")) {
			List<Vitals> listOfVitals=vs.findAllVitals();
			HttpSession hs=request.getSession();
			hs.setAttribute("vitals", listOfVitals);
			
			response.sendRedirect("displayVitals.jsp");
			
			response.setContentType("text/html");
		}else if(operation.equals("VitalsAlerts")){
			List<Vitals> listOfVitals=vs.findAllVitals();
			HttpSession hs=request.getSession();
			hs.setAttribute("vitals", listOfVitals);
			
			response.sendRedirect("VitalsAlerts.jsp");
			
			response.setContentType("text/html");
			
		}
				
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		VitalsService vs=new VitalsService();
		String operation=request.getParameter("operation");
		if(operation.equals("add")) {
			int BPHigh=Integer.parseInt(request.getParameter("BPHigh"));
			int BPLow=Integer.parseInt(request.getParameter("BPLow"));
			int SPO2=Integer.parseInt(request.getParameter("SPO2"));
			int PatientId=Integer.parseInt(request.getParameter("PatientId"));
			String RecordedOn=(request.getParameter("RecordedOn"));

			
			
			Vitals v=new Vitals();
			v.setBPHigh(BPHigh);
			v.setBPLow(BPLow);
			v.setPid(PatientId);
			v.setRecordedOn(RecordedOn);
			v.setSPO2(SPO2);
			
			String result=vs.storeVitals(v);
			pw.print(result);
			RequestDispatcher rd=request.getRequestDispatcher("Vitals.jsp");
			rd.include(request, response);
			response.setContentType("text/html");
		}else if(operation.equals("delete")) {
			int id=Integer.parseInt(request.getParameter("SNo"));
			String result=vs.deleteVitals(id);
			pw.println(result);
			RequestDispatcher rd=request.getRequestDispatcher("displayVitals.jsp");
			rd.include(request, response);
			response.setContentType("text/html");
		}
		
		
	}

}
