package com.learningjava.controller.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"admin-home"})
public class HomeController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletRequest response) throws ServerException, IOException {
		
	}
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}
