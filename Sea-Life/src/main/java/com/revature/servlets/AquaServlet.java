package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.revature.beans.Animal;
import com.revature.services.AnimalServiceImpl;
import com.revature.services.AquaService;


public class AquaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ObjectMapper om;
	private AquaService aq;

	public AquaServlet() {
		aq = new AnimalServiceImpl();
		om = new ObjectMapper();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURI());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		aq.createAnimal(om.readValue(request.getReader(), Animal.class));
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		aq.updateAnimal(om.readValue(request.getReader(), Animal.class));
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		aq.deleteAnimal(om.readValue(request.getReader(), Animal.class));
	}

}