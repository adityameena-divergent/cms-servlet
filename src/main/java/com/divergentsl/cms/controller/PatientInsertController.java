package com.divergentsl.cms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.divergentsl.cms.service.PatientService;
import com.divergentsl.cms.service.PatientServiceImpl;

@WebServlet("/patientInsert")
public class PatientInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PatientInsertController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int patientId = Integer.parseInt(request.getParameter("patient_id"));
		String patientName = request.getParameter("patient_name");
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("patient_age"));
		int weight = Integer.parseInt(request.getParameter("patient_weight"));
		int contactNumber = Integer.parseInt(request.getParameter("contact_number"));
		String address = request.getParameter("address");
		
		PatientService patientService = new PatientServiceImpl();
		patientService.insert(patientId, patientName, gender, age, weight, contactNumber, address);
		
		response.sendRedirect("PatientMenu.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
