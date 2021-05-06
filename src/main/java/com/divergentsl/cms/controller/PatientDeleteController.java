package com.divergentsl.cms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.divergentsl.cms.service.PatientService;
import com.divergentsl.cms.service.PatientServiceImpl;


@WebServlet("/patientDelete")
public class PatientDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PatientDeleteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int patientId = Integer.parseInt(request.getParameter("id"));
		
		PatientService patientService = new PatientServiceImpl();
		
		patientService.delete(patientId);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("patientList");
//		dispatcher.forward(request, response);
		response.sendRedirect("patientList");
	}


}
