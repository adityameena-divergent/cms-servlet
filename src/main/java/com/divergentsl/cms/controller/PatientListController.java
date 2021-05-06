package com.divergentsl.cms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.divergentsl.cms.entity.Patient;
import com.divergentsl.cms.service.PatientService;
import com.divergentsl.cms.service.PatientServiceImpl;

@WebServlet("/patientList")
public class PatientListController extends HttpServlet {

	private static final long serialVersionUID = 1L;
    
	public PatientListController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PatientService patientService = new PatientServiceImpl();
		
		List<Patient> allPatient = patientService.findAll();
		request.setAttribute("allPatient", allPatient);
		RequestDispatcher dispatcher = request.getRequestDispatcher("PatientList.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
