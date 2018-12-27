package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Animal;
import com.revature.services.AnimalServiceImpl;
import com.revature.services.AquaService;

@WebServlet("/AquaServlet")
public class AquaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ObjectMapper om;
	private AquaService aq;

	public AquaServlet() {
		aq = new AnimalServiceImpl();
		om = new ObjectMapper();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(aq.allAnimals());
		System.out.println(request.getRequestURI());
		response.getWriter().write(om.writeValueAsString(aq.allAnimals()));
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = Integer.parseInt(request.getParameter("id"));
		String gen = request.getParameter("genus");
		String chara = request.getParameter("characteristics");
		String hab = request.getParameter("habitat");
		String spec = request.getParameter("species");
		String food = request.getParameter("diet");
		aq.createAnimal(i, gen, chara, hab, spec, food);
		response.getWriter().write(om.writeValueAsString(aq.allAnimals()));
		System.out.println("it works");
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		aq.updateAnimal(om.readValue(request.getReader(), Animal.class));
	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		aq.deleteAnimal(om.readValue(request.getReader(), Animal.class));
	}

}