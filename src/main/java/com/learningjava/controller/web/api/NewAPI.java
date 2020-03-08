//package com.learningjava.controller.web.api;
//
//import java.io.IOException;
//
//import javax.inject.Inject;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.learningjava.model.NewModel;
//
//import com.learningjava.service.INewService;
//import com.learningjava.service.impl.NewService;
//import com.learningjava.utils.HttpUtil;
//
//@WebServlet(urlPatterns = {"/api-admin-new"})
//public class NewAPI extends HttpServlet {
//
//	@Inject
//	private INewService newService;
//
//	private static final long serialVersionUID = -915988021506484384L;
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");
//		newService=new NewService();
//		response.setContentType("application/json");
//		//HttpUtil.of(request.getReader());
//		NewModel newModel= HttpUtil.of(request.getReader()).toModel(NewModel.class);
//		newModel=newService.save(newModel);
//	}
//	protected void doPut(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//	}
//	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//	}
//}
//
