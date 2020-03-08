//package com.learningjava.controller.web.api;
//
//import com.learningjava.model.NewModel;
//import com.learningjava.service.ICategoryService;
//import com.learningjava.service.INewService;
//import com.learningjava.utils.HttpUtil;
//
//import javax.inject.Inject;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//@WebServlet(urlPatterns = {"/api-admin-new"})
//public class ahihi extends HttpServlet {
//    @Inject
//    private INewService newService;
//
//    @Inject
//    private ICategoryService categoryService;
//    private static final long serialVersionUID = -915988021506484384L;
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//        response.setContentType("application/json");
//        //HttpUtil.of(request.getReader());
//        NewModel aa= HttpUtil.of(request.getReader()).toModel(NewModel.class);
//        System.out.println(categoryService.findAll());
//        //aa=newService.save(aa);
//        //System.out.println(aa);
//    }
//    protected void doPut(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//    }
//    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//    }
//}
