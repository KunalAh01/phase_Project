package com.healthcare.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.healthcare.entity.Patient;
import com.healthcare.service.PatientService;

/**
 * Servlet implementation class patientController
 */
@WebServlet("/patientController")
public class patientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public patientController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PatientService ps=new PatientService();
		
		List<Patient> listOfPatient=ps.findAllPatient();
		HttpSession hs=request.getSession();
		hs.setAttribute("patient", listOfPatient);
		
		response.sendRedirect("displayPatient.jsp");
		
		response.setContentType("text/html");
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		PatientService ps=new PatientService();
		String operation=request.getParameter("operation");
		if(operation.equals("add")) {
			String email=request.getParameter("email");
			String name=request.getParameter("name");
			int phone=Integer.parseInt(request.getParameter("phone"));
			int age=Integer.parseInt(request.getParameter("age"));
			String diagnosis=request.getParameter("diagnosis");
			String remarks=request.getParameter("remarks");
			String gender=request.getParameter("gender");
			
			
			Patient patient=new Patient();
			patient.setAge(age);
			patient.setDiagnosis(diagnosis);
			patient.setEmail(email);
			patient.setGender(gender);
			patient.setName(name);
			patient.setPhone(phone);
			patient.setRemarks(remarks);
			
			
			String result=ps.storePatient(patient);
			pw.print(result);
			RequestDispatcher rd=request.getRequestDispatcher("AddPatient.jsp");
			rd.include(request, response);
			
		}
		else if(operation.equals("delete")) {
			int id=Integer.parseInt(request.getParameter("SNo"));
			String result=ps.deletePatient(id);
			pw.println(result);
			RequestDispatcher rd=request.getRequestDispatcher("displayPatient.jsp");
			rd.include(request, response);

		}
		else if(operation.equals("update")) {
			
//			int id=Integer.parseInt(request.getParameter("SNo"));
//			String remarks=request.getParameter("remarks");
//			Patient p=new Patient(id,remarks);
//			
//			String result=ps.updatePatient(p);
//			pw.println(result);
//			RequestDispatcher rd=request.getRequestDispatcher("displayPatient.jsp");
//			rd.include(request, response);

		}
		else if(operation.equals("search")) {
			int id=Integer.parseInt(request.getParameter("SNo"));
			
			
			Patient patient=ps.findPatient(id);
			HttpSession hs=request.getSession();
			hs.setAttribute("patient", patient);
			
			response.sendRedirect("viewParitcularPatient.jsp");
					
			
			
		}
		response.setContentType("text/html");
	
		
		
	}

}
